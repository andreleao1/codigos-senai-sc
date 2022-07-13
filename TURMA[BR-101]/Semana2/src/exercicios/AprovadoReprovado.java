package exercicios;

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String [] args) {
        double primeiraNota, segundaNota, terceiraNota, quartaNota, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        primeiraNota = scanner.nextDouble();
        System.out.println("Informe a segunda nota:");
        segundaNota = scanner.nextDouble();
        System.out.println("Informe a terceira nota:");
        terceiraNota = scanner.nextDouble();
        System.out.println("Informe a quarta nota:");
        quartaNota = scanner.nextDouble();

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media >= 7) {
            System.out.println("Aprovado por média.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
