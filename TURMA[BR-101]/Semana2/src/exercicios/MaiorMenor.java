package exercicios;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        int primeiroValor, segundoValor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        primeiroValor = scanner.nextInt();
        System.out.println("Informe outro número inteiro:");
        segundoValor = scanner.nextInt();

        if (primeiroValor > segundoValor) {
            System.out.println(primeiroValor);
        } else if (segundoValor > primeiroValor) {
            System.out.println(segundoValor);
        } else {
            System.out.println("Os números informados são iguais!");
        }
    }
}
