package Exercicios.src;

import java.util.Scanner;

public class Exercicio4 {
    public static final int quantidadePatas = 4;
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de cavalos comprados:");
        int quantidadeCavalo = scanner.nextInt();
        int quantidadeFerraduras = quantidadeCavalo * quantidadePatas;

        System.out.println("Será necessário comprar " + quantidadeFerraduras + " ferraduas.");
    }
}
