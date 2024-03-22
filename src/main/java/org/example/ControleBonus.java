package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    // Atributos
    List<Bonus> listaBeneficiarios = new ArrayList<>();

    // Construtor
    public ControleBonus() {}

    public ControleBonus(List<Bonus> listaBeneficiarios) {
        this.listaBeneficiarios = listaBeneficiarios;
    }

    // Métodos
    public double calculaTotalGasto() {
        double total = 0;
        for (Bonus beneficiario : listaBeneficiarios) {
            total += beneficiario.getValorBonus();
        }
        return total;
    }

    public void listarBeneficiarios() {
        for (Bonus beneficiario : listaBeneficiarios) {
            System.out.println(beneficiario);
        }
    }

    // Faltou o Método - Que adiciona objetos na lista!
    public void adicionarBeneficiario(Bonus beneficiario) {
        listaBeneficiarios.add(beneficiario);
    }


    // Getters e Setters
    public List<Bonus> getListaBeneficiarios() {
        return listaBeneficiarios;
    }

    public void setListaBeneficiarios(List<Bonus> listaBeneficiarios) {
        this.listaBeneficiarios = listaBeneficiarios;
    }


    // Deveria ter o toString aqui!
    @Override
    public String toString() {
        return String.format("""
                Class ControleBonus
                Lista de Beneficiários: %s
                Total Gasto: %.2f
                """, this.listaBeneficiarios, this.calculaTotalGasto());
    }

}
