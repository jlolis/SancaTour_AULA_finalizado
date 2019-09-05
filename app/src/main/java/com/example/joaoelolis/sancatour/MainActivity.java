package com.example.joaoelolis.sancatour;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.joaoelolis.sancatour.adapter.PontoAdapter;
import com.example.joaoelolis.sancatour.modelos.Ponto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Ponto> pontos = new ArrayList<>();
    private ArrayAdapter<Ponto> arrayAdapterPontos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViewPontos);
        criarPontos();
        arrayAdapterPontos = new PontoAdapter
                (MainActivity.this, (ArrayList<Ponto>) pontos);
        listView.setAdapter(arrayAdapterPontos);


    }

    public void criarPontos(){

        pontos.add(new Ponto("1","Balão do Bonde ",
                "Distância: 5,2 km",R.drawable.bar));
        pontos.add(new Ponto("2","Bar do Dalmir",
                "Distância:4,2 km",R.drawable.bonde));
        pontos.add(new Ponto("3","Camara Municipal",
                "Distância:1,9 km",R.drawable.camara));
        pontos.add(new Ponto("4","Catedral São Carlos",
                "Distância:1,2 km",R.drawable.catedral));
        pontos.add(new Ponto("5","Estatua da Liberdade",
                "Distância:3,4 km",R.drawable.estatua));
        pontos.add(new Ponto("5"," Conde Do Pinhal",
                "Distância:9,2 km",R.drawable.fazenda));

    }
}
