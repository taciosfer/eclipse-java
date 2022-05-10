/*Questão 3: Solicitar a idade de várias pessoas e imprimir: total de pessoas com menos de 21 anos; Total de
pessoas com mais de 50 anos. O programa termina quando idade for igual à -99.
USO DO LAÇO DE REPETIÇÃO 'WHILE'!
*/
package questoes;

import java.util.Scanner;

public class questaocinco
{
	public static void main(String[] args)
	{
		int x,contaVinteum=0,contaCinquenta=0;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Entre com a sua idade, em anos: ");
		x=ler.nextInt();
		
		while(x!=-99)
		{
			if(x<21)
			{
				contaVinteum++;
			}
			if(x>50)
			{
				contaCinquenta++;
			}
			System.out.println("Entre com a idade em anos: ");
			x=ler.nextInt();
		}
		System.out.println("Foram "+contaVinteum+" entradas de idades menores que 21 anos e "
				   +contaCinquenta+" entradas de idades maiores que 50 anos!");
	}
}