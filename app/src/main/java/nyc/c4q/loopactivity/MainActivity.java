package nyc.c4q.loopactivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button savenum;
    EditText enternum;
    int number;
    String userentry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textview);
        savenum = (Button) findViewById(R.id.display_num);
      //  enternum = (EditText) findViewById(R.id.enter_num);
        display_num();
    }

    public void display_num() {

//        userentry = enternum.getText().toString();
        number = 0;

        loopActivity loopActivity = new loopActivity();
        loopActivity.execute(number);



    }

    private class loopActivity extends AsyncTask<Integer, Integer, Integer>{

        ArrayList<Integer> listNum = new ArrayList<>();
        @Override
        protected void onPreExecute(){
            listNum.clear();
          textView.setText("processing  numbres");

        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            textView.setText(null);
            listNum.clear();
            for (int i=number; i<100000;i++){
                listNum.add(i);

            }
            publishProgress(listNum.size());
            return listNum.size();
        }

        @Override
        protected void onProgressUpdate(Integer... n){
            textView.setText("looping: " +n);

        }
        @Override
        protected void onPostExecute(Integer n){

            textView.setText("Lopps completed"+ n);

            startActivity(new Intent(MainActivity.this,LoginActivity.class));

        }


    }
}
