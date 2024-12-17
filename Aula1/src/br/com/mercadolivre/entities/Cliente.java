package br.com.mercadolivre.entities;

import java.util.Date;

public class Cliente {
	
	//int é um tipo primitivo
	//"String" é uma classe
	
	private int codigo = 0;
	private String nome = "nome vazio";
	private String cpf;
	private String endereco;
	public String estadocivil;
	protected float idade;
	
	private Date datanascimento = new Date();
	
	// getters and setters
	public void setNome (String novoNome)
	{
		nome = novoNome.toUpperCase();
	}
	public String getNome() {
		return nome;
	}
	
	//Gerado automático
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public float getIdade() {
		return idade;
	}
	public void setIdade(float idade) {
		this.idade = idade;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
}
