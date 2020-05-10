package exerciciosdejava;

import java.util.Scanner;

public class exerciciosdeswitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner leitor = new Scanner (System.in);
		
		int cod;
		int qnt;
		
		System.out.println("Digite o Código do produto:");
		cod=leitor.nextInt();
		System.out.println("Digite a quantidade que irá ser comprada:");
		qnt=leitor.nextInt();
		
		switch (cod) {
		case 100:
			System.out.println("Você comprou "+qnt+"x Cachorro Quente e isso custa "+3.2*qnt+" reais.");
			break;
		case 101:
			System.out.println("Você comprou "+qnt+"x Bauru Simples e isso custa "+4.3*qnt+" reais.");
			break;
		case 102:
			System.out.println("Você comprou "+qnt+"x Bauru com Ovo e isso custa "+5.5*qnt+" reais.");
			break;
		case 103:
			System.out.println("Você comprou "+qnt+"x Hambúrguer e isso custa "+3.2*qnt+" reais.");
			break;
		case 104:
			System.out.println("Você comprou "+qnt+"x Chesseburguer e isso custa "+4.3*qnt+" reais.");
			break;
		case 105:
			System.out.println("Você comprou "+qnt+"x Refrigerante e isso custa "+4*qnt+" reais.");
			break;
			
			default:
				System.out.println("Não foi possível indentificar este código.");
		}
		
		
		
		

		
		
		
		
		
	}

}
