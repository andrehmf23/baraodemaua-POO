package br.com.mercadolivre.entities;

public class Mercadolivre {
	//private Cliente cliente;
	//private Produto produto;
	
	public static void main(String[] args) {
		
		//ls arquivo.txt arq2.txl
		Cliente c1 = new Cliente();
		c1.setNome("Joao Castro");
		
		Produto p1 = new Produto();
		p1.setNome("Refrigerante");
		p1.setPreco(9.0f);
		
		Produto p2 = new Produto();
		p2.setNome("Cerveja");
		
		System.out.println("Seja bem-vindo(a), "+c1.getNome());// "System.out" -> Saida padrão do sistema
	}
}
