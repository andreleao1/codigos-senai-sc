package exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int numeroInformado = scanner.nextInt();

        if (numeroInformado%2 == 0) {
            System.out.println(numeroInformado + " é par!");
        } else {
            System.out.println(numeroInformado + " é ímpar!");
        }
    }
}
