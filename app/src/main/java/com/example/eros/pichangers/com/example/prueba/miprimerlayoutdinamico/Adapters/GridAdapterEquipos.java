package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eros.pichangers.R;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Equipos;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by w3201 on 11/05/2016.
 */
public class GridAdapterEquipos extends BaseAdapter {

    private Context context;
    private List<Equipos> mEquipos;
    private LayoutInflater layoutInflater;


    public GridAdapterEquipos(Context context, List<Equipos> mEquipos) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.mEquipos = mEquipos;
    }

    @Override
    public int getCount() {
        return mEquipos.size();
    }

    @Override
    public Object getItem(int position) {
        return mEquipos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null){
            view = layoutInflater.inflate(R.layout.cardquipos,null);
            viewHolder = new ViewHolder();
            viewHolder.nombre = (TextView) view.findViewById(R.id.tv_nombre);
            viewHolder.partidosPerdidos = (TextView) view.findViewById(R.id.tv_perdidos);
            viewHolder.partidosGanados = (TextView) view.findViewById(R.id.tv_ganados);
            viewHolder.fotoEquipo = (ImageView) view.findViewById(R.id.iv_fotoEquipo);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        Equipos equipos = mEquipos.get(position);

        viewHolder.nombre.setText(equipos.nombre);
        viewHolder.partidosGanados.setText(String.valueOf(equipos.partidosGanados));
        viewHolder.partidosPerdidos.setText(String.valueOf(equipos.partidosPerdidos));
        Log.i("Pichangers", equipos.urlFoto);
        Picasso.with(context)
                .load(equipos.urlFoto)
                .resize(140,180)
                .centerCrop()
                .into(viewHolder.fotoEquipo);
        return view;
    }

    class ViewHolder{
        ImageView fotoEquipo;
        TextView partidosGanados;
        TextView partidosPerdidos;
        TextView nombre;
    }
}
