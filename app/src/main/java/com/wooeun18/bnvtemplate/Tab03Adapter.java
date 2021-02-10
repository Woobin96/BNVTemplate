package com.wooeun18.bnvtemplate;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Tab03Adapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<Tab03RecyclerItem> items;

    public Tab03Adapter(Context context, ArrayList<Tab03RecyclerItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.tab03_item, parent, false);
        VH vh= new VH(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH)holder;
        //값 연결
        Tab03RecyclerItem item= items.get(position);


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder{

//        ImageView iv;
//        TextView tvTitle;
//        TextView tvMsg;
//        RatingBar ratingBar;

        public VH(@NonNull View itemView) {
            super(itemView);
        }
    }
}



















