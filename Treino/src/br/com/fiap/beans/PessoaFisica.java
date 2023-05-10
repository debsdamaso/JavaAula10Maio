package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{

	// variaveis
	private String rg;
	private String cpf;
	
	// vazio
	public PessoaFisica() {
		super();
	}
	// cheio
	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	
	// herdado
	public PessoaFisica(String nome, String email, int idade, double renda, String rg, String cpf) {
		super(nome, email, idade, renda);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	// getters e setters
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// IDENTIFICADOR
	public String identificador(){
		return "PF";
	}
	
	
	
}
