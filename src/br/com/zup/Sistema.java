package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static Scanner entradaDados(String prato) {
        System.out.println(prato);
        return new Scanner(System.in);
    }

    public static Prato cadastrarpratoDia() {

        System.out.println("___Seja bem vinde ao sistema de cadastro de pratos do dia do restaurante Coma Bem!___");
        String nomePrato = entradaDados("Digite o nome do prato que deseja cadastrar:").nextLine();
        double valorPrato = entradaDados("Digite o preço do prato:").nextDouble();

        Prato prato1 = new Prato(nomePrato, valorPrato);

        prato1.setNomePrato(nomePrato);
        prato1.setValorPrato(valorPrato);

        return prato1;
    }

    public static List<Ingredientes> retornoIngrediente() {
        String escolhaIngredientes = entradaDados("Digite os ingredientes que deseja acrescentar!").nextLine();
        Ingredientes ingredientesPrato = new Ingredientes(escolhaIngredientes);
        List<Ingredientes> retornoIngrediente = new ArrayList<>();
        return retornoIngrediente;
    }
}
