package com.epiclancers.myapplication;

import com.intrusoft.sectionedrecyclerview.Section;

import java.util.List;

public class SectionHeader implements Section<Child> {

    List<Child> childList;
    String date_total;
    String sale_recycler_date;

    public SectionHeader(List<Child> childList, String date_total, String sale_recycler_date) {
        this.childList = childList;
        this.date_total = date_total;
        this.sale_recycler_date = sale_recycler_date;
    }

    @Override
    public List<Child> getChildItems() {
        return childList;
    }

    public String getDate_total() {
        return date_total;
    }

    public String getSale_recycler_date() {
        return sale_recycler_date;
    }
}