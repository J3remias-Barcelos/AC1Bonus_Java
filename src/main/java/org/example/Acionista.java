package org.example;

public class Acionista implements Bonus{
    // Atributos
    private String nome;
    private int qtdAcoes;
    private double precoAcoes;

    // Construtor
    public Acionista(String nome, int qtdAcoes, double precoAcoes) {
        this.nome = nome;
        this.qtdAcoes = qtdAcoes;
        this.precoAcoes = precoAcoes;
    }

    // Métodos
    public double ganhoDasAcoes() {
        return this.qtdAcoes * this.precoAcoes;
    }
    public double getValorBonus() {
        return this.ganhoDasAcoes() * 0.20;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(int qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public double getPrecoAcoes() {
        return precoAcoes;
    }

    public void setPrecoAcoes(double precoAcoes) {
        this.precoAcoes = precoAcoes;
    }

    // toString
    @Override
    public String toString() {
        return String.format("""
                Class Acionista
                Nome: %s
                Quantidade de Ações: %d
                Preço das Ações: %.2f
                Ganho das Ações: %.2f
                """, this.nome, this.qtdAcoes, this.precoAcoes, this.getValorBonus());
    }
}
