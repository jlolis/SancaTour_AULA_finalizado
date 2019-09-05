package com.example.joaoelolis.sancatour.modelos;

import android.widget.ImageView;

import com.example.joaoelolis.sancatour.R;

public class Ponto {

    private String id;
    private String nome;
    private String distancia;
    private int imagem;

    public Ponto(String id, String nome, String distancia, int imagem) {
        this.id = id;
        this.nome = nome;
        this.distancia = distancia;
        this.imagem = imagem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
