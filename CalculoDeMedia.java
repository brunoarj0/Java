package personal;

import java.util.Scanner;

public class CalculoDeMedia {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int qtdValores = 0;
		double valor = 0;
		double total = 0;

		while (valor != -1) {
			System.out.print("Digite um valor ou (-1) para sair: ");
			valor = teclado.nextDouble();

			if (valor >= 0 && valor <= 10) {
				total += valor;
				qtdValores++;
				
			} else if (valor != -1) {
				System.out.println("Nota inválida!");
			}
		}
		
		if (qtdValores == 0) {
			System.out.println("Nenhum dado recebido");
		} else {
			double media = total / qtdValores;
			System.out.println("A média ficou: " + media);
		}
		teclado.close();
	}
}
