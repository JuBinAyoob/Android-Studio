package jubin.recyclerbin;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jubin on 3/7/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    List<ItemDetails> listitems = new ArrayList<ItemDetails>();

    public Adapter(List<ItemDetails> listitems)
    {
        this.listitems=listitems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data, null); // oncreat==>inflate

        ViewHolder viewHolder=new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.itemname.setText(listitems.get(position).getTitle());
        holder.itemdetail.setText(listitems.get(position).getDetail());

        holder.launcher.setImageResource(listitems.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView itemname,itemdetail;
        ImageView launcher;

        public ViewHolder(View itemView) {
            super(itemView);

            itemname=(TextView)itemView.findViewById(R.id.title);
            itemdetail=(TextView)itemView.findViewById(R.id.details);

            launcher=(ImageView)itemView.findViewById(R.id.image_icon);

        }
    }

}
