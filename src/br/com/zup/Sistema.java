package br.com.zup;

import java.util.Scanner;

public class Sistema {

    private static Scanner entradaDados(String prato) {
        System.out.println(prato);
        return new Scanner(System.in);
    }

    public static void pratoDia() {

        System.out.println("___Seja bem vinde ao sistema de cadastro de pratos do dia do restaurante Coma Bem!___");
        String nomePrato = entradaDados("Digite o nome do prato que deseja cadastrar:").nextLine();
        double valorPrato = entradaDados("Digite o preço do prato:").nextDouble();


    }
}
