package polimorfismo;

public class TesteAnimall
{
	private static String som;

	public static void main(String[] args)
	{
		Cachorro cachorro = new Cachorro("Cachorro",8,"consegue correr!");
		cachorro.exibir();
		cachorro.fazSom(null);
		Cavalo cavalo = new Cavalo("Cavalo",16,"consegue correr!");
		cavalo.exibir();
		cavalo.fazSom(null);
		Preguica preguica = new Preguica("Preguica",24,"consegue escalar arvores!");
		preguica.exibir();
		preguica.fazSom(null);
		Animall animal = null;
	}
}