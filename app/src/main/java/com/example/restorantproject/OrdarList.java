package com.example.restorantproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class OrdarList extends AppCompatActivity {
 private RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordar_list);
        rc.getLayoutManager();
        rc.setLayoutManager((RecyclerView.LayoutManager) LinearLayoutManager(this)) ;
         new RecyclerAdapter(DataSource.getItemCount);
    }

    private Object LinearLayoutManager(OrdarList ordarList) {

        return null;
    }
}
