package com.roquesito.miprimeravez.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.roquesito.miprimeravez.R;

import java.util.ArrayList;
import java.util.List;

public class Grid extends AppCompatActivity {

    private GridView gridView;
    private List<String> nombres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = (GridView) findViewById(R.id.gridView);

        List<String> nombres = new ArrayList<String>();
        nombres.add("Jose");
        nombres.add("Maria");
        nombres.add("Jesus");
        nombres.add("Ana");
        nombres.add("Jorge");

        MyAdapter adapter = new MyAdapter(this, R.layout.grid_item, nombres);
        gridView.setAdapter(adapter);
    }
}
