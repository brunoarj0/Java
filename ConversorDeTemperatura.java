package personal;

import java.util.Scanner;

public class ConversorDeTemperatura {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Escolha a conversão: \n"
				+ "1 - C° -> F°\n"
				+ "2 - F° -> C°\n"
				+ "3 - K° -> C°\n"
				+ "4 - C° -> K°\n"
				+ "5 - F° -> K°\n"
				+ "6 - K° -> F°\n"
				+ "Opção: ");
		
		int opc = teclado.nextInt();
		
		System.out.print("Digite a temperatura a ser convertida: ");
		double temp = teclado.nextDouble();
		
		switch (opc) {
		case 1: {
			double cal = ((temp * 9) / 5) + 32;
			System.out.printf("A temperatura convertida para F° fica: %.2f", cal);
		} break;
		
		case 2: {
			double cal = ((temp - 32) * 5) / 9;
			System.out.printf("A temperatura convertida para C° fica: %.2f", cal);
		} break;
		
		case 3: {
			double cal = temp - 273.15;
			System.out.printf("A temperatura convertida para C° fica: %.2f", cal);
		} break;
		
		case 4: {
			double cal = temp + 273.15;
			System.out.printf("A temperatura convertida para K° fica: %.2f", cal);
		} break;
		
		case 5: {
			double cal = (temp - 32) * 5 / 9 + 273.15;
			System.out.printf("A temperatura convertida para K° fica: %.2f", cal);
		} break;
		
		case 6: {
			double cal = (temp - 273.15) * 9 / 5 + 32;
			System.out.printf("A temperatura convertida para F° fica: %.2f", cal);
		} break;
		
		default:
            System.out.println("Inválido");
            break;
	}
		teclado.close();
	}
}
