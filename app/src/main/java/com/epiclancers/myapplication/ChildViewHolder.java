package com.epiclancers.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ChildViewHolder extends RecyclerView.ViewHolder {

    TextView name,supplier,cp,qty,total;
    public ChildViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        supplier = (TextView) itemView.findViewById(R.id.supplier);
        cp = (TextView) itemView.findViewById(R.id.cp);
        qty = (TextView) itemView.findViewById(R.id.qty);
        total = (TextView) itemView.findViewById(R.id.total);
    }
}