package exercicios;

import java.util.Scanner;

public class CompraMaca {
    public static final double PRECO_VAREJO = 0.30;
    public static final double PRECO_ATACADO = 0.25;

    public static void main(String[] args) {
        int quantidadeComprada;
        double valorCompra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de maçãs compradas:");
        quantidadeComprada = scanner.nextInt();

        if (quantidadeComprada >= 12) {
            valorCompra = PRECO_ATACADO * quantidadeComprada;
        } else {
            valorCompra = PRECO_VAREJO * quantidadeComprada;
        }

        System.out.println("O valor total da compra foi R$ " + valorCompra);
    }
}
