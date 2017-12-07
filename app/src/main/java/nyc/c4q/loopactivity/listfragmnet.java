package nyc.c4q.loopactivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nikunjan on 12/6/17.
 */

public class listfragmnet extends Fragment{
    View rootView;

    public listfragmnet() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_list, container, false);
     //   fragmentTransaction.addToBackStack("next");
    }
}


