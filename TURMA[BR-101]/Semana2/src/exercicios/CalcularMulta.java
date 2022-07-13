package exercicios;

import java.util.Scanner;

public class CalcularMulta {
    public static void main(String[] args) {
        int velocidadeVeiculo, velocidadeMaximaVia;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a velocidade máxima da via:");
        velocidadeMaximaVia = scanner.nextInt();
        System.out.println("Informe a velocidade do veículo:");
        velocidadeVeiculo = scanner.nextInt();

        int excessoVelocidade = velocidadeVeiculo - velocidadeMaximaVia;
        if (excessoVelocidade > 0 && excessoVelocidade <=10) {
            System.out.println("R$ 10");
        } else if (excessoVelocidade > 10 && excessoVelocidade <=30) {
            System.out.println("R$ 100");
        } else {
            System.out.println("R$ 300");
        }
    }
}
