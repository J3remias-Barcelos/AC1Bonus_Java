package org.example;

public class FuncionarioHorista extends Funcionario{
    // Atributos
    private int qtdHoraExtra;
    private double valorHoraExtra;


    // Construtor
    public FuncionarioHorista(int codigo, String nome, double salario, int qtdHoraExtra, double valorHoraExtra) {
        super(codigo, nome, salario);
        this.qtdHoraExtra = qtdHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    // Métodos que serão implementados
    public double getGanho() {
        return this.qtdHoraExtra * this.valorHoraExtra;
    }

    public double getValorBonus() {
        return this.getGanho() * 0.10;
    }


    // Getters e Setters
    public int getQtdHoraExtra() {
        return qtdHoraExtra;
    }

    public void setQtdHoraExtra(int qtdHoraExtra) {
        this.qtdHoraExtra = qtdHoraExtra;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    // toString
    @Override
    public String toString() {
        return String.format("""
                Class FuncionarioHorista
                Código: %d
                Nome: %s
                Salário: %.2f
                Quantidade de Horas Extras: %d
                Valor da Hora Extra: %.2f
                """, this.getCodigo(), this.getNome(), this.getSalario(), this.qtdHoraExtra, this.valorHoraExtra);
    }
}
