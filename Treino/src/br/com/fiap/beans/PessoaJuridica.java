package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {

	// variaveis
	private String razaoSocial;
	private String cnpj;
	
	// VAZIO
	public PessoaJuridica() {
		super();
	}

	// CHEIO
	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	// faz source juntando com o construtor da superclasse, sem o atributo de referencia: na ultima linha > Pessoa(String, String, int, double) com as 2 linhas selecionadas
	// construtor cheio com herança
	public PessoaJuridica(String nome, String email, int idade, double renda, String razaoSocial, String cnpj) {
		super(nome, email, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// setters e getters
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	// IDENTIFICADOR
	public String identificador(){
		return "PJ";
	}
	
	
	
	
}
