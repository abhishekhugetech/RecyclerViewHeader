package com.epiclancers.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class SectionViewHolder extends RecyclerView.ViewHolder {

    TextView sale_recycler_date;
    TextView date_total;
    public SectionViewHolder(View itemView) {
        super(itemView);
        sale_recycler_date = (TextView) itemView.findViewById(R.id.sale_recycler_date);
        date_total = (TextView) itemView.findViewById(R.id.date_total);
    }
}