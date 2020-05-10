package exerciciosdejava;

import java.util.Scanner;

public class exerciciosdeswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		int cod;
		
		System.out.println("Digite o Código do produto:");
		cod=leitor.nextInt();
		
		switch (cod) {
		case 001:
			System.out.println("O produto é: Parafuso");
			break;
		case 002:
			System.out.println("O produto é: Porca");
			break;
		case 003:
			System.out.println("O produto é: Prego");
			break;
		case 004:
			System.out.println("O produto é: Ferramenta");
			break;
			default:
				System.out.println("Não foi possível indentificar este código.");
		}
		
		
		
		
		

	}

}
