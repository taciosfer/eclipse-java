package polimorfismo;

public class Cavalo extends Animall
{
	private String corre;
	private String som;
	
	public Cavalo(String nome,int idade, String corre)
	{
		super(nome,idade);
		this.corre=corre;
	}
	@Override
	public void fazSom(String som)
	{
		System.out.println("HIIN IN IN HINIR");
	}
	public void exibir()
	{
		System.out.println("\nO "+getNome()+", de "+getIdade()+" anos, "+corre);
	}
	public String getCorre() {
		return corre;
	}
	public void setCorre(String corre) {
		this.corre = corre;
	}
}