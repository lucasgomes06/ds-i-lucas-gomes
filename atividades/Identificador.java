package atividades;

import java.util.Scanner;

public class Identificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

         System.out.print("Digite a palavra que você deseja identificar na frase: ");
        String palavra = scanner.nextLine();

        if (frase.contains(palavra)) {
            System.out.println("A frase '" + frase + "' contem a palavra '" + palavra + "'");
        }  else  {
            System.out.println("A frase '" + frase + "' nao contem a palavra '" + palavra + "'");
        }

        scanner.close();
    }
}
