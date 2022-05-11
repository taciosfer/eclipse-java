/*Questão 2: Crie uma classe 'Avião' e apresente os atributos e métodos referentes à ela;
Em seguida, crie um objeto, defina as instâncias dele e apresente suas informações no console.
*/
package questoes;

public class Aviao
{
	private String nomeComercial;
	private String modelo;
	private int qtdeMotores;
	private double maxVelocidade;
	private int qtdePassageiros;
	private int qtdeCarga;
	
	public Aviao(String nomeComercial,String modelo,int qtdeMotores,double maxVelocidade,int qtdePassageiros,int qtdeCarga)
	{
		this.nomeComercial=nomeComercial;
		this.modelo=modelo;
		this.qtdeMotores=qtdeMotores;
		this.maxVelocidade=maxVelocidade;
		this.qtdePassageiros=qtdePassageiros;
		this.qtdeCarga=qtdeCarga;
	}
	public void imprimirInfo()
	{
		System.out.println("O aviao '"+nomeComercial+"' "+modelo+", conta com "+qtdeMotores+" motores, que lhe conferem "+
		"velocidade maxima de "+maxVelocidade+" km/h, comportando ate "+qtdePassageiros+" passageiros e transportando ate "+
		qtdeCarga+" toneladas por voo.");
	}
	public String getNomeComercial() {
		return nomeComercial;
	}
	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQtdeMotores() {
		return qtdeMotores;
	}
	public void setQtdeMotores(int qtdeMotores) {
		this.qtdeMotores = qtdeMotores;
	}
	public double getMaxVelocidade() {
		return maxVelocidade;
	}
	public void setMaxVelocidade(double maxVelocidade) {
		this.maxVelocidade = maxVelocidade;
	}
	public int getQtdePassageiros() {
		return qtdePassageiros;
	}
	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}
	public int getQtdeCarga() {
		return qtdeCarga;
	}
	public void setQtdeCarga(int qtdeCarga) {
		this.qtdeCarga = qtdeCarga;
	}
}