package exerciciosdejava;

import java.util.Scanner;

public class exerciciosdeswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		int cod;
		
		System.out.println("Digite o C�digo do produto:");
		cod=leitor.nextInt();
		
		switch (cod) {
		case 001:
			System.out.println("O produto �: Parafuso");
			break;
		case 002:
			System.out.println("O produto �: Porca");
			break;
		case 003:
			System.out.println("O produto �: Prego");
			break;
		case 004:
			System.out.println("O produto �: Ferramenta");
			break;
			default:
				System.out.println("N�o foi poss�vel indentificar este c�digo.");
		}
		
		
		
		
		

	}

}
