package com.epiclancers.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    AdapterSectionRecycler adapterRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //setLayout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        //Create a List of Child DataModel
        List<Child> childList = new ArrayList<>();
        childList.add(new Child("Apple IPHone","Raju","200","2","400"));
        childList.add(new Child("Apple Imac","Raju","50000","2","100000"));
        childList.add(new Child("Apple Imac","Raju","50000","2","100000"));
        childList.add(new Child("Apple Imac","Raju","50000","2","100000"));
        childList.add(new Child("Apple Imac","Raju","50000","2","100000"));

        //Create a List of Section DataModel implements Section
        List<SectionHeader> sections = new ArrayList<>();
        sections.add(new SectionHeader(childList, "100400","4/11/18"));

        childList = new ArrayList<>();
        childList.add(new Child("Bada Pau","Raju","200","2","400"));
        childList.add(new Child());
        childList.add(new Child());
        childList.add(new Child());
        childList.add(new Child());
        sections.add(new SectionHeader(childList, "100400","8/11/18"));

        childList = new ArrayList<>();
        childList.add(new Child());
        childList.add(new Child());
        childList.add(new Child());
        childList.add(new Child());
        childList.add(new Child());
        sections.add(new SectionHeader(childList, "100400","10/11/18"));


        adapterRecycler = new AdapterSectionRecycler(this, sections);
        recyclerView.setAdapter(adapterRecycler);


    }
}
