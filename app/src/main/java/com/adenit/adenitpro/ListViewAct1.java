package com.adenit.adenitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewAct1 extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_act1);

        lv=(ListView)findViewById(R.id.lvBooks);

        ArrayList<String>books= new ArrayList<String>();
        books.add("Material Design");
        books.add("Firebase");
        books.add("Facebook Integration");
        books.add("SQLite");
        books.add("GCM");
        books.add("Material Design");
        books.add("Firebase");
        books.add("Facebook Integration");
        books.add("SQLite");
        books.add("GCM");
        books.add("Material Design");
        books.add("Firebase");
        books.add("Facebook Integration");
        books.add("SQLite");
        books.add("GCM");

        final ArrayAdapter<String> adt= new ArrayAdapter<String>(
                ListViewAct1.this, android.R.layout.simple_list_item_1,books);
        lv.setAdapter(adt);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewAct1.this, "You have clicked "+
                        adt.getItem(position), Toast.LENGTH_LONG).show();
            }
        });

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                adt.remove(adt.getItem(position));
                return false;
            }
        });}
}

