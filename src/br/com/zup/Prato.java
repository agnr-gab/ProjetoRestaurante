package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nomePrato;
    private double valorPrato;

    private List<Ingredientes> listaIngrediente = new ArrayList<>();

    public Prato() {

    }

    public Prato(String nomePrato, double valorPrato) {
        this.nomePrato = nomePrato;
        this.valorPrato = valorPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(double valorPrato) {
        this.valorPrato = valorPrato;
    }

    public List<Ingredientes> getListaIngrediente() {
        return listaIngrediente;
    }

    public void adicionarIngrediente(Ingredientes acompanhamentos) {
        listaIngrediente.add(acompanhamentos);
    }

    public void exibirListaIngredientes() {
        for (Ingredientes referencia : listaIngrediente) {
            System.out.println(referencia);
        }
    }

    @Override
    public String toString() {
        StringBuilder retornoPrato = new StringBuilder();
        retornoPrato.append("Nome do prato: " + getNomePrato());
        retornoPrato.append("\n Valor do prato: R$" + getValorPrato() + " reais");
        retornoPrato.append("\n Quantidade de ingredientes escolhidos: " + listaIngrediente.size());
        retornoPrato.append("\n Os ingredientes escolhidos: " + listaIngrediente);
        return retornoPrato.toString();
    }
}