package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double num1 = teclado.nextDouble();
		
		System.out.print("Digite o primeiro n�mero: ");
		double num2 = teclado.nextDouble();
		
		System.out.print("Digite a opera��o: ");
		String op = teclado.next();
		
		double res = "+".equals(op) ? num1 + num2 : 0;
		res = "-".equals(op) ? num1 - num2 : res;
		res = "*".equals(op) ? num1 * num2 : res;
		res = "/".equals(op) ? num1 / num2 : res;
		
		System.out.printf("O Resultado �: " + res);
		
		teclado.close();
	}

}
