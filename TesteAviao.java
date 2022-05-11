package questoes;

public class TesteAviao
{
	public static void main(String[] args)
	{
		Aviao avum = new Aviao("Airbus","A380",4,1185.0,853,60);
		System.out.println("Avioes: \n");
		avum.imprimirInfo();
	}
}