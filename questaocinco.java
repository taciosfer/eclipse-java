/*Questão 5: Crie um programa que leia um número do teclado até que encontre um número igual a zero.
No final, mostre a soma dos números digitados.
USO DO LAÇO DE REPETIÇÃO 'DO WHILE'!
*/
package questoes;

import java.util.Scanner;

public class questaoseis
{
	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		
		int numTeclado,somaNum=0;
				
		do
		{
			System.out.println("Tecle um numero qualquer: ");
			numTeclado=teclado.nextInt();
			somaNum+=numTeclado;
		}
		while(numTeclado!=0);
		System.out.println("Os numeros teclados, somados, totalizam "+somaNum+"!");
	}
}