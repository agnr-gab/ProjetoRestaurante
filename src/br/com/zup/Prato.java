package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    List<Ingredientes> listaIngrediente = new ArrayList<>();

    public void adicionarIngrediente(Ingredientes acompanhamentos){
        listaIngrediente.add(acompanhamentos);
    }
}
