package questoes;

public class questaoseis
{
	public static void main(String[] args)
	{
		int[]A=new int[6];
		int x,soma=0;
		A[0]=1;
		A[1]=0;
		A[2]=5;
		A[3]=-2;
		A[4]=-5;
		A[5]=7;
		soma=A[0]+A[1]+A[5];
		
		System.out.println("O resultado da soma solicitada e "+soma+"!\n");
		
		A[3]=100;
		
		for(x=0;x<6;x++)
		{
			System.out.println("A posicao "+(x+1)+" do vetor tem valor "+A[x]+".");
		}
	}	
}
