package com.fiap.entity;

public class Produto {

    String nome;
    String descricao;
    float valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * Para ficar mais fácil a impressão, sobrescrevemos o método toString da classe Produto retornando
     * todos atributos da classe.
     */
    @Override
    public String toString() {
        return "Produto [nome = " + nome + ", descricao = " + descricao + ", valor = " + valor + " ]";
    }
}
