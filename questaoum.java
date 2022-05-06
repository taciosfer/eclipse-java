package questoes;

import java.util.Scanner;

public class questaoum {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		System.out.println("Por favor, insira o primeiro número inteiro: ");
		a = ler.nextInt();
		System.out.println("Por favor, insira o segundo número inteiro: ");
		b = ler.nextInt();
		System.out.println("Por favor, insira o terceiro número inteiro: ");
		c = ler.nextInt();
		
		if(a<b && b<c)
		{
			System.out.println("\nO maior entre os três números é o "+c);
		}
		else if(b<a && a<c)
		{
			System.out.println("\nO maior entre os três números é o "+c);
		}
		else if(a<c && c<b)
		{
			System.out.println("\nO maior entre os três números é o "+b);
		}
		else if(c<a && a<b)
		{
			System.out.println("\nO maior entre os três números é o "+b);
		}
		else if(c<b && b<a)
		{
			System.out.println("\nO maior entre os três números é o "+a);
		}
		else if(b<c && c<a)
		{
			System.out.println("\nO maior entre os três números é o "+a);
		}
		else
		{
			System.out.println("\nAlguma entrada não é válida!");
		}
	}
}