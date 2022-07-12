package Exercicios.src;

import java.util.Scanner;

public class Exercicio2Solucao1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 1212.00;
        System.out.println("Informe o valor do seu salário");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalario = salarioUsuario/salarioMinimo;

        System.out.println("Você recebe " + String.format("%.2f", quantidadeSalario) + "Salário(s) mínimo(s)");
    }
}
