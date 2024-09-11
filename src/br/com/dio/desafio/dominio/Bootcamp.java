package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = this.getDataInicial().plusDays(45);
    private Set<Dev> devsInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public LocalDate getDataInicial() {
        return this.dataInicial;
    }

    public LocalDate getDataFinal() {
        return this.dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return this.devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return this.conteudos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((devsInscritos == null) ? 0 : devsInscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (this.nome == null) {
            if (other.nome != null)
                return false;
        } else if (!this.nome.equals(other.nome))
            return false;
        if (this.descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!this.descricao.equals(other.descricao))
            return false;
        if (this.dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!this.dataInicial.equals(other.dataInicial))
            return false;
        if (this.dataFinal == null) {
            if (other.dataFinal != null)
                return false;
        } else if (!this.dataFinal.equals(other.dataFinal))
            return false;
        if (this.devsInscritos == null) {
            if (other.devsInscritos != null)
                return false;
        } else if (!this.devsInscritos.equals(other.devsInscritos))
            return false;
        if (this.conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!this.conteudos.equals(other.conteudos))
            return false;
        return true;
    }
}
