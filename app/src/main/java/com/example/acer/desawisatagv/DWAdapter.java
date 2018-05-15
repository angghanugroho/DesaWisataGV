package com.example.acer.desawisatagv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Acer on 14/05/2018.
 */

public class DWAdapter extends RecyclerView.Adapter <DWAdapter.ViewHolder>{

    private List<DataWisata> listDW;
    private Context context;

    public DWAdapter(List<DataWisata> listDW, Context context){
        this.listDW = listDW;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_layout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        DataWisata car  = listDW.get(position);

        holder.dwtName.setText("Desa Wisata : " + car.getDwNama());
        holder.dwtLokasi.setText("Lokasi : " + car.getDwLokasi());

        Glide.with(context)
                .load(car.getDwImage())
                .into(holder.dwtImage);
        //on click linear layout to check the position
        holder.dwt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Position : " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return listDW.size();
    }

    // inner class of adapter
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView dwtImage;
        public TextView dwtName;
        public TextView dwtLokasi;
        public LinearLayout dwt;


        public ViewHolder(View itemView) {
            super(itemView);

            dwtImage = (ImageView) itemView.findViewById(R.id.img1);
            dwtName = (TextView) itemView.findViewById(R.id.txtnama);
            dwtLokasi = (TextView) itemView.findViewById(R.id.txtlokasi);
            dwt = (LinearLayout) itemView.findViewById(R.id.desa_wisata);
        }
    }
}
