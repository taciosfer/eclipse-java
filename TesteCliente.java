package questoes;

public class TesteCliente
{
	public static void main(String[] args)
		{
		//6º, instanciando um objeto da classe Cliente:
		Cliente clium = new Cliente("Tacio","Ferreira",30,"masculino","Taciosfer");
		
		System.out.println("Listagem de Clientes\n");
		clium.imprimirInfo();
		}
}