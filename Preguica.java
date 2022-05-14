package polimorfismo;

public class Preguica extends Animall
{
	private String som;
	private String escala;
	
	public Preguica(String nome,int idade,String escala)
	{
		super(nome,idade);
		this.escala=escala;
	}
	@Override
	public void fazSom(String som)
	{
		System.out.println("AAA AAAA");
	}
	
	public void exibir()
	{
		System.out.println("\nA "+getNome()+", de "+getIdade()+" anos, "+escala);
	}
	public String getEscala() {
		return escala;
	}
	public void setEscala(String escala) {
		this.escala = escala;
	}
}