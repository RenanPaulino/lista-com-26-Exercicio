package br.com.voeairlines.treinamentopoo;

public class Algoritimo08 {

	private String nome ;
	private String endereco;
	private String telefone;
	
	public void dados(String nome, String end, String tel) {
		this.nome = nome;
		this.endereco = end;
		this.telefone = tel;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}
	public String dadosImprimir() {
		return"Nome:" + getNome() + "\nEndereço: " +getEndereco()+
				"\nTelefone: " + getTelefone();
	}
	
}
