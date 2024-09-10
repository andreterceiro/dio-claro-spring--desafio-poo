package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    
    public int getCargaHoraria() {
        return this.cargaHoraria;
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

    @Override
    public double calcularXP() {
        return Curso.XP_PADRAO * this.getCargaHoraria();
    }
}
