package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteHeranca {
	// Metodos static
	// String
	static String texto(String j){
	return JOptionPane.showInputDialog(j);
	}
	// int
	static int inteiro(String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	// double
	static double real(String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		// instanciar objetos
		
		// String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("Digite o nome da empresa"),
												  texto("Digite o email da empresa"),
												  inteiro("Digite o tempo da empresa"),
												  real("Digite a receita/renda da empresa"),
												  texto("Digite a razão social"),
												  texto("Digite o CNPJ"));
		Endereco objEnderecoPj = new Endereco("Informe o logradouro da empresa");
		// String nome, String email, int idade, double renda, String rg, String cpf
		PessoaFisica objPf = new PessoaFisica(texto("Digite o nome da pessoa"),
				  							  texto("Digite o email pessoal"),
				  							  inteiro("Digite a idade"),
				  							  real("Digite a renda"),
				  							  texto("Digite o RG"),
				  							  texto("Digite o CPF"));
		Endereco objEnderecoPf = new Endereco("Informe o logradouro pessoal");
		/*Endereco objEndereco = new Endereco (texto("Informe o logradouro"));
		
		objPj.setEndereco(objEndereco);
		objPf.setEndereco(objEndereco);*/
		
		
	// SAÍDAS
		System.out.println("INFORMAÇÕES DA PJ");
		System.out.println("Nome da Empresa: " + objPj.getNome() +
						   "\nEmail: " + objPj.getEmail() + 
						   "\nCNPJ: " + objPj.getCnpj() +
						   "\nTempo da empresa: " + objPj.getIdade() +
						   "\nReceita da empresa: " + objPj.getRenda() +
						   "\nRazão Social: " + objPj.getRazaoSocial() +
						   "\nCNPJ: " + objPj.getCnpj() +
						   "\nEndereço da empresa: " + objPj.getEndereco());
		System.out.println("\nINFORMAÇÕES DA PF");
		System.out.println("Nome da Pessoa: " + objPf.getNome() +
				   		   "\nEmail pessoal: " + objPf.getEmail() + 
				   		   "\nCPF: " + objPf.getCpf() +
				   		   "\nIdade: " + objPf.getIdade() +
				   		   "\nRenda: " + objPf.getRenda() +
				   		   "\nRG: " + objPf.getRg() +
				   		   "\nCPF: " + objPf.getCpf() +
				   		   "\nEndereço pessoal: " + objPf.getEndereco());
	}

}
