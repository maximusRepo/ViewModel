package com.example.veiwmodel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {


    private Context context;
    private ArrayList<Responsemodel> responsemodels;

    public Adapter(Context context, ArrayList<Responsemodel> responsemodels) {
        this.context = context;
        this.responsemodels = responsemodels;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyler_layout,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder myViewHolder, int i) {
        Responsemodel model = responsemodels.get(i);
        myViewHolder.textView.setText(model.getName());
        Glide.with(context).load(model.getImageurl()).into(myViewHolder.imageView);

    }

    @Override
    public int getItemCount() {
        return responsemodels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
