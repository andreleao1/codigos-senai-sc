package exercicios;

import java.util.Scanner;

public class AprovadoReprovadoRecuperacao {
    public static void main(String [] args) {
        double primeiraNota, segundaNota, terceiraNota, quartaNota, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        primeiraNota = scanner.nextDouble();
        System.out.println("Informe a segudna nota:");
        segundaNota = scanner.nextDouble();
        System.out.println("Informe a terceira nota:");
        terceiraNota = scanner.nextDouble();
        System.out.println("Informe a quarta nota:");
        quartaNota = scanner.nextDouble();

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media >= 7) {
            System.out.println("Aprovado por média.");
        } else {
            System.out.println("Informe a nota da prova de recuperação:");
            double notaRecuperacao = scanner.nextDouble();

            if (media + notaRecuperacao >= 10) {
                System.out.println("Aprovado na recuperação.");
            } else {
                System.out.println("Reprovado.");
            }
        }
    }
}
