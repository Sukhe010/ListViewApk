package com.example.listviewapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr = {"List 1", "List2", "List3", "List4","List5","List6","List7","List8", "List9", "List10", "Another One"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        // Using Built in Array adaptor
        // ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        // listView.setAdapter(ad);

        // Using our custom adaptor
        SukheAdaptor ad = new SukheAdaptor(this,R.layout.my_sukhe_layout,arr);
        listView.setAdapter(ad);

    }
}