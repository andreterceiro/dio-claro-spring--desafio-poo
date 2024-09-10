package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data; 

    public LocalDate getData() {
        return this.data;
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

    @Override
    public double calcularXP() {
        return Mentoria.XP_PADRAO + 20d;
    }    
}
