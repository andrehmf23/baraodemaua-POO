package Macaco;

public class Macaco {
	private String nome;
	private int bucho=0;
	
	public int verBucho() {
		return bucho;
	}
	
	public void Comer(String alimento) {
		bucho++;
	}
	
	public void Digerir() {
		bucho--;
	}
	
	static public void main(String[] args) 
	{
		Macaco m1 = new Macaco(), m2 = new Macaco();
		
		m1.Comer("Maça");
		m1.Comer("Pera");
		m1.Comer("Banana");
		
		m2.Comer("Maça");
		m2.Comer("Pera");
		m2.Comer("Banana");
		
		System.out.println("Macaco 1: " + m1.verBucho() + " Macaco 2: " + m2.verBucho());
		m1.Digerir();
		System.out.println("Macaco 1: " + m1.verBucho() + " Macaco 2: " + m2.verBucho());
	}
}
