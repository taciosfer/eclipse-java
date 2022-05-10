/*Questão 1: Informar todos os números de 1000 a 1999 que quando divididos por 11 têm resto 5.
USO DO LAÇO DE REPETIÇÃO 'FOR'!
*/
package questoes;
		
public class questaotres
{
	public static void main(String[] args)
	{
		int x;
		
		for(x=1000;x<=1999;x++)
		{
			if(x%11==5)//Lembrar SEMPRE que = ATRIBUI e == IGUALA!!!
			{
				System.out.println(x+" e um dos numeros que atende aos criterios!");
			}
		}
	}
}