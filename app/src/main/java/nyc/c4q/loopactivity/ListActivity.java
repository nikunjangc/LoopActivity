package nyc.c4q.loopactivity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static nyc.c4q.loopactivity.R.layout.activity_list;

public class ListActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(activity_list);
        textView = (TextView) findViewById(R.id.session_message_textview);
        Intent intent = getIntent();
        String user = intent.getStringExtra("currentUser");
        textView.setText("You are currently signed in as: " + user);

      List<display> listdisplay=new ArrayList<>();

        RecyclerView movieRecyclerView = (RecyclerView) findViewById(R.id.list_recyclerview);
        for (int i=0; i<=10 ;i++) {
            listdisplay.add(new display(i));
        }

        listfragmnet mainFragment = new listfragmnet();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, mainFragment);
        fragmentTransaction.commit();

        ListAdaptor listAdaptor= new ListAdaptor(listdisplay);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        movieRecyclerView.setAdapter(listAdaptor);
        movieRecyclerView.setLayoutManager(linearLayoutManager);
    }
}
