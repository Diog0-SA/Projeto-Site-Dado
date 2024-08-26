package dado;

import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		
		// Variaveis
		int qtdLado = 2;
		int dado = 1;
		int qtdDado = 1;
		
		Scanner scanner = new Scanner(System.in); // Abrindo scanner
		
		System.out.println("Escolha as opções: ");
		System.out.println("[1] - Personalizado");
		for(int i = 4; i <= 36; i += 4) {
			System.out.println("[ " + i + " ]");
		} 											// Dando as opções
		
		// Pegando resposta com tratamento de erro
		boolean continua = true;
		while(continua == true) {
		System.out.println("Digite sua resposta: ");
		qtdLado = scanner.nextInt(); 
		
		// Varificando se o valor é par
		if(qtdLado % 2 == 0) {
			continua = false;
		}
		else if(qtdLado == 1) {						// Dado personalizado
			Scanner dadoP = new Scanner(System.in); // Abrindo scanner
			System.out.println("Quantos lado você deseja: ");
			qtdLado = dadoP.nextInt();
			dadoP.close(); // Fechando scanner
			continua = false;
		}
		else {
			System.out.println("Erro! Tente de novo");
		}
		}
		
		// Quantos dados deseja:
		Scanner scannerDado = new Scanner(System.in); // Abrindo scanner
		
		System.out.println("Quantos dado deseja? ");
		qtdDado = scannerDado.nextInt();
		
		scannerDado.close(); // Fechando scanner
		
		// Fazendo o sorteio do valor
		for(int i = 1; i <= qtdDado; i++) {	
			
		Random random = new Random();
		dado = random.nextInt(qtdLado);
		
		// Mostrando o resultado
		System.out.println("--------".repeat(7));
		System.out.printf("Dado n%d°:" + dado + "\n", i);
		}
		
		scanner.close(); // Fechando scanner
		
		// tá dando erro no personalizado.         -arrumar
		// Colocar a opção de dados com números diferentes. Quando chegar da faculdade eu termino
		
		
}
}
