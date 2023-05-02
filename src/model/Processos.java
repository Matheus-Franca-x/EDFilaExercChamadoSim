package model;

public class Processos {

	private String nome;
	private int qtdRetornos;
	
	public Processos(String nome, int qtdRetorno)
	{
		this.nome = nome;
		this.qtdRetornos = qtdRetorno;
	}

	public String getNome() {
		return nome;
	}


	public int getQtdRetornos() {
		return qtdRetornos;
	}

	public void decrementRtr()
	{
		qtdRetornos--;
	}
	

}
