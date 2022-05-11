/*Questão 1: Crie uma classe 'Cliente' e apresente os atributos e métodos referentes à ela;
Em seguida, crie um objeto, defina as instâncias dele e apresente suas informações no console.
*/
package questoes;

public class Cliente
{//1º, declarar atributos da classe:
	private String primeiroNome;
	private String segundoNome;
	private String apelido;
	private String genero;
	private int idade;
	//2º, declarar método construtor (nome do construtor IGUAL nome da classe!):
	public Cliente(String primeiroNome,String segundoNome,int idade,String genero,String apelido)
	{//3º, parametrar os atributos:
		this.primeiroNome=primeiroNome;
		this.segundoNome=segundoNome;
		this.idade=idade;
		this.genero=genero;
		this.apelido=apelido;
	}//4º, declarar demais métodos da classe:
	public void imprimirInfo()
	{
		System.out.println("Cliente "+primeiroNome+" "+segundoNome+" tem "+idade+
		" anos de idade, se identificou de genero "+genero+" e aprecia ser chamade '"+apelido+"'.");
	}//5º, gerar gets e sets:
	public String getPrimeiroNomeCliente() {
		return primeiroNome;
	}
	public void setPrimeiroNomeCliente(String primeiroNomeCliente) {
		this.primeiroNome = primeiroNomeCliente;
	}
	public String getSegundoNomeCliente() {
		return segundoNome;
	}
	public void setSegundoNomeCliente(String segundoNomeCliente) {
		this.segundoNome = segundoNomeCliente;
	}
	public String getApelidoCliente() {
		return apelido;
	}
	public void setApelidoCliente(String apelidoCliente) {
		this.apelido = apelidoCliente;
	}
	public String getGeneroCliente() {
		return genero;
	}
	public void setGeneroCliente(String generoCliente) {
		this.genero = generoCliente;
	}
	public int getIdadeCliente() {
		return idade;
	}
	public void setIdadeCliente(int idadeCliente) {
		this.idade = idadeCliente;
	}
}