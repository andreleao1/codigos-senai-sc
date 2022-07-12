package Exercicios.src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2Solucao2 {
    public static final double SALARIO_MINIMO = 1212.00;

    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatacao = new DecimalFormat("#.00");
        System.out.println("Informe seu salário:");
        double salarioUsuario = entrada.nextDouble();
        double quantidadeSalario = salarioUsuario / SALARIO_MINIMO;

        System.out.println("Você recebe " + formatacao.format(quantidadeSalario) + " salário(s) mínimo(s).");
    }
}
