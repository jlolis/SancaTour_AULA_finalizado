package com.example.joaoelolis.sancatour.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.joaoelolis.sancatour.R;

public class PontoActivity extends AppCompatActivity {

    private TextView textViewTitulo;
    private TextView textViewDistancia;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.layout_lista_pontos);

        textViewTitulo = findViewById(R.id.textViewTitulo);
        textViewDistancia = findViewById(R.id.textViewDistancia);


        Intent intent = getIntent();
        String titulo =intent.getStringExtra("TITULO");
        String distancia =intent.getStringExtra("DISTANCIA");

        textViewTitulo.setText(titulo);
        textViewDistancia.setText(distancia);



    }
}
