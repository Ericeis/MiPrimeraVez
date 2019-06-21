package com.roquesito.miprimeravez.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.roquesito.miprimeravez.R;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context conexto;
    private int layout;
    private List<String> nombres;
    TextView tv01;

    public MyAdapter(Context conexto, int layout, List<String> nombres) {
        this.conexto = conexto;
        this.layout = layout;
        this.nombres = nombres;
    }

    @Override
    public int getCount() {
        return this.nombres.size();
    }

    @Override
    public Object getItem(int position) {
        return this.nombres.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // copia la vista
        View v = convertView;

        //inflamos la vista q nos ha llegado de nuestro layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.conexto);
        v = layoutInflater.inflate(R.layout.grid_item, null);

        //traer el valor actual de la position
        String datos = nombres.get(position);

        tv01 = (TextView)v.findViewById(R.id.texto);
        tv01.setText(datos);

        //retornamos el valor de la vista
        return v;
    }
}
