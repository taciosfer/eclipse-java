package questoes;

public class TesteAnimal extends Animal
{
	public TesteAnimal(String nome, int idade, String som, String acao)
	{
		super(nome, idade, som, acao);
	}
	public static void main(String[] args)
	{
		Animal Cachorro = new Animal("Cachorro",5,"AUAU","correr");
		Cachorro.exibeInfo();
		Animal Cavalo = new Animal("Cavalo",10,"HIIN IN IN HINIR","correr");
		Cavalo.exibeInfo();
		Animal Preguica = new Animal("Preguica",15,"AAA AAAA","escalar");
		Preguica.exibeInfo();
	}
}