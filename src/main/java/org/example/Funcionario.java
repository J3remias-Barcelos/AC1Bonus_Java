package org.example;

public abstract class Funcionario implements Bonus{
    // Atributos
    private int codigo;
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(int codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos abstrato
    public abstract double getGanho();

    @Override
    public abstract double getValorBonus();


    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // toString
    @Override
    public String toString() {
        return String.format("""
                Class Funcionario
                Código: %d
                Nome: %s
                Salário: %.2f
                """, this.codigo, this.nome, this.salario);
    }
}
