package questoes;

import java.util.Scanner;

public class questaosete
{
	public static void main(String[] args)
	{
		float[][]matriz=new float[3][3];
		int i,j,maiorDez=0;
		
		Scanner leia=new Scanner(System.in);
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Digite o valor desejado: ");
				matriz[i][j]=leia.nextFloat();
				if(matriz[i][j]>10)//Teste que funcionou! Por quê?
				maiorDez++;				
			}
		}
		System.out.println("A matriz conta com "+maiorDez+" entradas maiores que 10!");
	}
}