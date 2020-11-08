package com.samansepahvand.spacenavigationviewtutorial.adapter;

import android.content.Context;
import android.media.Image;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.samansepahvand.spacenavigationviewtutorial.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {



    Context context;

    ArrayList<DataModel> dataModels;




    public Adapter(Context context, ArrayList<DataModel> dataModels) {
        this.context = context;
        this.dataModels = dataModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {


        View view=LayoutInflater.from(context).inflate(R.layout.item_recyclerview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder parent, final int position) {


        DataModel dataModel=dataModels.get(position);

        parent.title.setText(dataModel.getTitle());
        parent.desc.setText(dataModel.getDesc());
        parent.anchor.setText(dataModel.getAnchor());
        parent.imageView.setImageResource(dataModel.getImage());






    }


    @Override
    public int getItemCount() {
     return dataModels.size();

    }

    public  class ViewHolder extends RecyclerView.ViewHolder {


        TextView title,desc,anchor;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            title=(TextView)itemView.findViewById(R.id.title);
            desc=(TextView)itemView.findViewById(R.id.desc);
            anchor=(TextView)itemView.findViewById(R.id.anchor);

            imageView=(ImageView)itemView.findViewById(R.id.img_icon);




        }


    }
}
