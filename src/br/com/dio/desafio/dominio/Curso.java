package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "[Curso: " +
            "titulo = '" + this.getTitulo() +
            "', descrição = '" + this.getDescricao() +
            "', carga horária = " + this.getCargaHoraria() + 
        "]";
    }    
}
