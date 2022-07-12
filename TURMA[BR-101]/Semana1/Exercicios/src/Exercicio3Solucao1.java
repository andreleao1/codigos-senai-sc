package Exercicios.src;

import java.util.Scanner;

public class Exercicio3Solucao1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int distanciaPlaca = 1;
        System.out.println("Informe o tempo do deslocamento:");
        double tempoDeslocamento = scanner.nextDouble();
        double velocidade = distanciaPlaca/tempoDeslocamento;

        System.out.println("A velocidade média do veículo foi de " + velocidade + " m/s.");
    }
}
