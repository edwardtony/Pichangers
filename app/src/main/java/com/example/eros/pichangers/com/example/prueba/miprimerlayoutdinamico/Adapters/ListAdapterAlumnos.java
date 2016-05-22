package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eros.pichangers.R;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Alumnos;

import java.util.List;

/**
 * Created by Anthony on 19/05/16.
 */
public class ListAdapterAlumnos extends BaseAdapter{

    private LayoutInflater inflater;
    private Context context;
    private List<Alumnos> alumnos;

    public ListAdapterAlumnos(Context context, List<Alumnos> alumnos) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.alumnos = alumnos;
    }

    @Override
    public int getCount() {
        return alumnos.size();
    }

    @Override
    public Object getItem(int position) {
        return alumnos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Long.parseLong(alumnos.get(position).codigo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.cardalumnos,null);
            viewHolder = new ViewHolder();
            viewHolder.img_balon = (ImageView) convertView.findViewById(R.id.img_balon);
            viewHolder.img_mas = (ImageView) convertView.findViewById(R.id.img_mas);
            viewHolder.nombre = (TextView) convertView.findViewById(R.id.tv_nombre);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Alumnos alumno = alumnos.get(position);

        viewHolder.nombre.setText(alumno.nombre);
        viewHolder.codigo.setText(alumno.codigo);
        return convertView;
    }

    class ViewHolder{
        ImageView img_balon;
        ImageView img_mas;
        TextView nombre;
        TextView codigo;
    }
}
