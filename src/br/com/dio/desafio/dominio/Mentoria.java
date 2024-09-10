package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data; 

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "[Mentoria: " + 
            "titulo = " + this.getTitulo() +
            ", descricao = " + this.getDescricao() +
            ", data = " + this.getData() +
        "]";
    }
}
