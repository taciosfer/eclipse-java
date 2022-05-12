package questoes;

public class Animal
{//1º, declaração dos atributos de superclasse:
	public String nome;
	public int idade;
	public String som;
	public String acao;
	//2º, declaração dos métodos do construtor:
	public Animal(String nome,int idade,String som,String acao)
	{//3º, parametração dos atributos:
		super();
		this.nome=nome;
		this.idade=idade;
		this.som=som;
		this.acao=acao;
	}//4º, declaração de demais métodos:
	public void exibeInfo()
	{
		System.out.println("O Animal e o(a) "+nome+", que tem "+idade+" anos de idade, que faz '"+som+"', e e capaz de "+acao+"!");
	}//5º, 'gets' e 'sets':
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
}