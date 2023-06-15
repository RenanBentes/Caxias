package com.example.prova2.Topicos;

public class Topico {
    int insignia;
    String Nome;
    String Alcunha;

    public Topico(int insignia, String nome, String alcunha) {
        this.insignia = insignia;
        Nome = nome;
        Alcunha = alcunha;
    }

    public int getInsignia() {
        return insignia;
    }

    public void setInsignia(int insignia) {
        this.insignia = insignia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getAlcunha() {
        return Alcunha;
    }

    public void setAlcunha(String alcunha) {
        Alcunha = alcunha;
    }
}

