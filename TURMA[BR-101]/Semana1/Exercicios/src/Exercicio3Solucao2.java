package Exercicios.src;

import java.util.Scanner;

public class Exercicio3Solucao2 {
    public static final int DISTANCIA = 1;

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tempo do deslocamento:");
        double tempoDeslocamento = scanner.nextDouble();
        double velocidadeMedia = DISTANCIA/tempoDeslocamento;
        System.out.println("A velocidade média do veículo foi de " + velocidadeMedia + " m/s.");
    }
}
