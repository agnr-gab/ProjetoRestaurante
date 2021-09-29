package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List<Prato> listaPratos = new ArrayList<>();

    public Cardapio() {

    }

    public Cardapio(List<Prato> listaPratos) {
        this.listaPratos = listaPratos;
    }

    public void adicionarPrato(Prato pratoEscolhido) {
        listaPratos.add(pratoEscolhido);
    }

    public List<Prato> getListaPratos() {
        return listaPratos;
    }

    public void setListaPratos(List<Prato> listaPratos) {
        this.listaPratos = listaPratos;
    }

    @Override
    public String toString() {
        StringBuilder retornoCardapio = new StringBuilder();
        retornoCardapio.append("\nO prato do dia é: " + listaPratos);
        return retornoCardapio.toString();
    }
}
