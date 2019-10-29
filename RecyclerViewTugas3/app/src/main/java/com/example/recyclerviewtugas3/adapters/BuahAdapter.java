package com.example.recyclerviewtugas3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtugas3.R;
import com.example.recyclerviewtugas3.models.Buah;

import java.util.ArrayList;
import java.util.List;

public class BuahAdapter extends RecyclerView.Adapter<BuahAdapter.MyViewHolder> {
    //1 dataset
    private List<Buah> listBuah = new ArrayList<>();

    //2 constructor
    public BuahAdapter(List<Buah> listBuah) {
        this.listBuah = listBuah;
    }

    @NonNull
    @Override
    public BuahAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View vh = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_buah,viewGroup,false);

        //4 membuat view holder
        MyViewHolder viewHolder = new MyViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BuahAdapter.MyViewHolder holder, int position) {
        Buah item = listBuah.get(position);
        holder.txtBuah.setText(item.getJudul());
        holder.imageBuah.setImageDrawable(item.getImage());
    }

    @Override
    public int getItemCount() {
        return listBuah.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageBuah;
        public TextView txtBuah;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //6 menghubungkan id di layout ke view holder
            imageBuah = itemView.findViewById(R.id.image_buah);
            txtBuah = itemView.findViewById(R.id.txt_buah);
        }
    }
}
