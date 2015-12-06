package com.example.nas.custom;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    ListView free_list;
    ItemListAdapter adapter;

    TextView  mTextView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mTextView2 = (TextView) findViewById(R.id.tv_name1);
        free_list = (ListView) findViewById(R.id.free_list);

        mTextView2.setText("Show List View");

        adapter = new ItemListAdapter(this,R.layout.activity_list,getData());
        free_list.setAdapter(adapter);





    }



    private ArrayList<ItemList> getData() {
        ArrayList<ItemList> item = new ArrayList<>();
        item.add(new ItemList("Titulo 1", "Subtitulo 1", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 2", "Subtitulo 2", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 3", "Subtitulo 3", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 4", "Subtitulo 4", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 5", "Subtitulo 5", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 6", "Subtitulo 6", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 7", "Subtitulo 7", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 8", "Subtitulo 8", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 9", "Subtitulo 9", R.drawable.ic_launcher));
        item.add(new ItemList("Titulo 10", "Subtitulo 10", R.drawable.ic_launcher));
        return item;
    }



}
