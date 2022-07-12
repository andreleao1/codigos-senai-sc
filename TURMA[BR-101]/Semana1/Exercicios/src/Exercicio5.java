package Exercicios.src;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int sucessor, antecessor;
        System.out.println("Informe um número:");
        int numero = scanner.nextInt();
        sucessor = numero + 1;
        antecessor = numero - 1;
        System.out.println("O sucessor de " + numero + " é " + sucessor + " e o antecessor é " + antecessor);
    }
}
