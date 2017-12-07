package nyc.c4q.loopactivity;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Nikunjan on 12/6/17.
 */

public class ListAdaptor extends RecyclerView.Adapter<ListViewHolder> {
    private final List<display> listdisplay;

    public ListAdaptor(List<display> listdisplay) {
        this.listdisplay=listdisplay;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_itemview, parent, false);
        return new ListViewHolder(childView);

    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        display d =listdisplay.get(position);
        holder.onBind(d);
    }

    @Override
    public int getItemCount() {
        return listdisplay.size();
    }
}
