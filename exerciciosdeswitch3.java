package exerciciosdejava;

import java.util.Scanner;

public class exerciciosswitch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner leitor = new Scanner (System.in);
		
		int cod;
		
		System.out.println("Digite o C�digo da sua op��o no Menu:");
		cod=leitor.nextInt();
		
		switch (cod) {
		case 1:
			System.out.println("Op��o 1: Rotina de inclus�o de Alunos.");
			break;
		case 2:
			System.out.println("Op��o 2: Rotina de altera��o de Alunos.");
			break;
		case 3:
			System.out.println("Op��o 3: Rotina de exclus�o de Alunos.");
			break;
		case 4:
			System.out.println("Op��o 4: Rotina de consulta de Alunos.");
			break;
			default:
				System.out.println("N�o foi poss�vel indentificar esta op��o.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

 }}
