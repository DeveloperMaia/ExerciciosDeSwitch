package exerciciosdejava;

import java.util.Scanner;

public class exerciciosswitch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner leitor = new Scanner (System.in);
		
		int cod;
		
		System.out.println("Digite o Código da sua opção no Menu:");
		cod=leitor.nextInt();
		
		switch (cod) {
		case 1:
			System.out.println("Opção 1: Rotina de inclusão de Alunos.");
			break;
		case 2:
			System.out.println("Opção 2: Rotina de alteração de Alunos.");
			break;
		case 3:
			System.out.println("Opção 3: Rotina de exclusão de Alunos.");
			break;
		case 4:
			System.out.println("Opção 4: Rotina de consulta de Alunos.");
			break;
			default:
				System.out.println("Não foi possível indentificar esta opção.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

 }}
