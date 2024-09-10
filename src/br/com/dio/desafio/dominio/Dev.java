package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>()   ;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você naõ está matriculado em nenhum conteúdo");
        }
    }

    public double calcularTotalXP() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    public String getNome() {
        return this.nome;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return this.conteudosConcluidos;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return this.conteudosInscritos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (this.nome == null) {
            if (other.nome != null)
                return false;
        } else if (!this.nome.equals(other.nome))
            return false;
        if (this.conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!this.conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        if (this.conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!this.conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        return true;
    }
}
