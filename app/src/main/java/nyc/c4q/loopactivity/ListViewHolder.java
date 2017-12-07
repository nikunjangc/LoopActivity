package nyc.c4q.loopactivity;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Nikunjan on 12/6/17.
 */

public class ListViewHolder extends RecyclerView.ViewHolder{
    private TextView num;

    public ListViewHolder(View itemView) {
        super(itemView);
        num=(TextView) itemView.findViewById(R.id.number);
    }


    public void onBind(display d) {
        num.setText(d.getNum());
    }
}
