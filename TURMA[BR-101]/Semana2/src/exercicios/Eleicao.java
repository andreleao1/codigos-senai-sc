package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Eleicao {
    public static final int ANO_ATUAL = LocalDate.now().getYear();
    public static void main(String[] args) {
        int anoNascimento;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento:");
        anoNascimento = scanner.nextInt();

        boolean podeVotar = ANO_ATUAL - anoNascimento >= 16;

        if (podeVotar) {
            System.out.println("Você já pode votar neste ano.");
        } else {
            System.out.println("Você ainda não pode votar. Quem sabe na próxima :)");
        }
    }
}
