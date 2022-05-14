package polimorfismo;

public class Cachorro extends Animall
{
	private String corre;
	private String som;
	
	public Cachorro(String nome,int idade,String corre)
	{
		super(nome,idade);
		this.corre=corre;
	}
	@Override
	public void fazSom(String som)
	{
		System.out.println("AU AU");
	}
	public void exibir()
	{
		System.out.println("O "+getNome()+", de "+getIdade()+" anos, "+corre);
	}
	public String getCorre() {
		return corre;
	}
	public void setCorre(String corre) {
		this.corre = corre;
	}
}