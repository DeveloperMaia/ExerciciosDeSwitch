package exerciciosdejava;

import java.util.Scanner;

public class exerciciosdeswitch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner ( System.in);
		
		float s1, s2, df;
		int cargo;
		
		System.out.println("Descubra os dados sobre sua mudança salarial!");
		System.out.println("Digite seu salário atual:");
		s1=leitor.nextFloat();
		
		System.out.println("Digite o código do seu cargo de acordo a tabela:");
		System.out.println("001 -Diretor");
		System.out.println("002 -Engenheiro");
		System.out.println("003 -Técnico");
		System.out.println("004 -Gerente");
		System.out.println("005 -Analista");
		System.out.println("006 -Coordenador");
		cargo=leitor.nextInt();
		
		switch (cargo) {
		
		case 001:
		System.out.println("Seu novo salário é "+(s1+(s1/100*10))+", seu antigo salário era "+s1+" e a diferença é de "+s1/100*10);
			break;
		case 002:
			System.out.println("Seu novo salário é "+(s1+(s1/100*20))+", seu antigo salário era "+s1+" e a diferença é de "+s1/100*20);
			break;
		case 003:
			System.out.println("Seu novo salário é "+(s1+(s1/100*30))+", seu antigo salário era "+s1+" e a diferença é de "+s1/100*30);
			break;
		case 004:
			System.out.println("Seu novo salário é "+(s1+(s1/100*10))+", seu antigo salário era "+s1+" e a diferença é de "+s1/100*10);
			break;
		case 005:
			System.out.println("Seu novo salário é "+(s1+(s1/100*30))+", seu antigo salário era "+s1+" e a diferença é de "+s1/100*30);
			break;
		case 006:
			System.out.println("Seu novo salário é "+(s1+(s1/100*20))+", seu antigo salário era "+s1+" e a diferença é de "+s1/100*20);
			break;
			default:
			System.out.println("Seu novo salário é "+(s1+(s1/100*40))+", seu antigo salário era "+s1+" e a diferença é de "+s1/100*40);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
