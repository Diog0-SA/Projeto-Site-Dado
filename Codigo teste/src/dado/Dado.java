package dado;

import java.util.Random;
import java.util.Scanner;

public class Dado {

    public static int apenasInteiro(Scanner scanner, String mensagem) { // Caso digite um número não inteiro
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void opcoes(int qtdDado, int qtdLado) { // Mostrando as opções
        Random random = new Random();
        for (int i = 1; i <= qtdDado; i++) {
            int resultado = random.nextInt(qtdLado) + 1; 
            System.out.println("Dado " + i + ": " + resultado);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int qtdDado = apenasInteiro(scanner, "Quantos dados deseja? ");
            int qtdLado = 0;

            do {
                menu();
                qtdLado = apenasInteiro(scanner, "Digite sua opção: ");

                if (qtdLado == 1) {
                    qtdLado = apenasInteiro(scanner, "Quantos lados o dado personalizado terá? ");
                } else if (qtdLado >= 4 && qtdLado <= 36 && qtdLado % 2 == 0) {
                    // Opção válida
                }else if(qtdLado == 0){
                	System.out.println("Fim do programa!");
                }
                else {
                    System.out.println("Opção inválida.");
                }

                if (qtdLado > 0) {
                    opcoes(qtdDado, qtdLado);
                    System.out.println("----".repeat(10));
                }
            } while (qtdLado > 0);
        }
    }

    private static void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("[1] - Dado personalizado");
        for (int i = 4; i <= 36; i += 4) {
            System.out.println("[" + i + "]");
        }
        System.out.println("[0] - Para");
    }
}