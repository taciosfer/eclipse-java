package questoes;

import java.util.Scanner;

public class questaodois {
	
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
			System.out.println("\nEm ordem crescente, os números são "+a+b+c);
		}
		else if(a<c && c<b)
		{
			System.out.println("\nEm ordem crescente, os números são "+a+c+b);
		}
		else if(b<a && a<c)
		{
			System.out.println("\nEm ordem crescente, os números são "+b+a+c);
		}
		else if(b<c && c<a)
		{
			System.out.println("\nEm ordem crescente, os números são "+b+c+a);
		}
		else if(c<a && a<b)
		{
			System.out.println("\nEm ordem crescente, os números são "+c+a+b);
		}
		else if(c<b && b<a)
		{
			System.out.println("\nEm ordem crescente, os números são "+c+b+a);
		}
		else
		{
			System.out.println("\nOpção inválida! Verifique os dados inseridos e tente novamente!");
		}
	}
}