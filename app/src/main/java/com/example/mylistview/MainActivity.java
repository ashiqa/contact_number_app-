package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        ArrayList<String> myContact= new ArrayList<String>();
        myContact.add("mom:966454342") ;
        myContact.add("dad:9668946941") ;
        myContact.add("pizza delivery man:96689463311") ;
        myContact.add("dhobi :966894699") ;
        myContact.add("nani : 9668946941") ;
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this ,android.R.layout.simple_list_item_1,myContact);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Dialing "+myContact.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }
}