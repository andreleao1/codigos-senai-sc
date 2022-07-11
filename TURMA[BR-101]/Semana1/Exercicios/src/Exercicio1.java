import java.util.Scanner;

public class Exercicio1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a largura do terreno:");
        double larguraTerreno = scanner.nextDouble();
        System.out.println("Informe o comprimento do terreno:");
        double comprimentoTerreno = scanner.nextDouble();

        double areaTerreno = larguraTerreno * comprimentoTerreno;

        System.out.println("O terreno possui " + areaTerreno + " m² de área.");
    }
}
