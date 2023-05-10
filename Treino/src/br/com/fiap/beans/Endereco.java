package br.com.fiap.beans;

public class Endereco {
	// VARIAVEIS
	private String logradouro;
	
	// vazio
	public Endereco() {
		super();
	}
	
	// cheio
	public Endereco(String logradouro) {
		super();
		this.logradouro = logradouro;
	}
	// getters and setters
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	
}
