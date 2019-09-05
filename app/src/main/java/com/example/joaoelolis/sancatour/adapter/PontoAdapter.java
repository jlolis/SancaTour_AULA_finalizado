package com.example.joaoelolis.sancatour.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.joaoelolis.sancatour.R;
import com.example.joaoelolis.sancatour.modelos.Ponto;

import java.util.ArrayList;
import java.util.List;

import static com.example.joaoelolis.sancatour.R.layout.layout_lista_pontos;

public class PontoAdapter extends ArrayAdapter {

    private Context context;
    private List<Ponto> pontos;

    public PontoAdapter(Context context, ArrayList<Ponto> pontos){

        super(context,0,pontos);
        this.context = context;
        this.pontos = pontos;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    View listaPonto = convertView;

        if (listaPonto == null){
            listaPonto = LayoutInflater.from(context).
                    inflate(R.layout.layout_lista_pontos,parent ,false);
        }

        TextView textViewTitulo = listaPonto.findViewById(R.id.textViewTitulo);
        TextView textViewDistancia = listaPonto.findViewById(R.id.textViewDistancia);
        ImageView imageView = listaPonto.findViewById(R.id.imageViewPonto);

        textViewTitulo.setText(pontos.get(position).getNome());
        textViewDistancia.setText(pontos.get(position).getDistancia());
        imageView.setImageResource(pontos.get(position).getImagem());



        //ConstraintLayout constraintLayout = listaPonto.findViewById(R.layout.layout_lista_pontos);

        return listaPonto;

    }
}
