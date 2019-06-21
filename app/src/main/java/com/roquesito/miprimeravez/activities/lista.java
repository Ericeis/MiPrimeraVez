package com.roquesito.miprimeravez.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.roquesito.miprimeravez.R;

import java.util.ArrayList;
import java.util.List;

public class lista extends AppCompatActivity {

    private ListView list01;
    private List<String> nombres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        list01 = (ListView)findViewById(R.id.lista);

        List<String> nombres = new ArrayList<String>();
        nombres.add("Jose");
        nombres.add("Maria");
        nombres.add("Jesus");
        nombres.add("Ana");
        nombres.add("Jorge");

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres);

        //list01.setAdapter(adapter);
        MyAdapter adapter = new MyAdapter(this, R.layout.item_list, nombres);
        list01.setAdapter(adapter);
    }


}

