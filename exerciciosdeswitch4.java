package exerciciosdejava;

import java.util.Scanner;

public class exerciciosdeswitch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		
		int cod;
		float n1, n2, n3;
		
		System.out.println(" Digite sua primeira nota:");
		n1=leitor.nextFloat();
		
		System.out.println(" Digite sua segunda nota:");
		n2=leitor.nextFloat();
		
		System.out.println(" Digite sua terceira nota:");
		n3=leitor.nextFloat();
		
		System.out.println(" Digite sua se quer a média aritimética (1) ou a média ponderada(2):");
		cod=leitor.nextInt();
		
		switch (cod) {
		
		case 1:
		System.out.println(" Sua média é "+(n1+n2+n3)/3);
		
		case 2:
			System.out.println(" Sua média é "+((n1*3)+(n2*3)+(n3*4))/3);
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
