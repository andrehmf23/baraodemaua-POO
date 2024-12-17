package Bichinhovirtual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bichinhovirtual {
	
	private String nome;
	private int idade;
	private float fome;
	private float saude;
	private float tedio;
	
	public Bichinhovirtual(String nome,int idade) {
		
		this.nome = nome;
		this.idade =  idade;
		fome = (float) (Math.random()*100);
		saude = (float) (Math.random()*100);
		tedio = (float) (Math.random()*100);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void brincar(float hora) {
		if(saude>0)saude-=(hora+(fome/100));
		if(fome<100)fome+=(hora*3);
		if(tedio>0)tedio-=hora*10;
		limitreset();
		
	}
	
	public void comer(int comida) {
		if(fome>0)fome-=comida*10;
		if(saude<100)saude+=comida;
		if(tedio<100)tedio++;
		limitreset();
	}
	
	public void limitreset() {
		if(fome<0)fome=0; else if(fome>100)fome=100;
		if(saude<0)saude=0; else if(saude>100)saude=100;
		if(tedio<0)tedio=0; else if(tedio>100)tedio=100;
	}
	
	public void str() {
		System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nFome:  "+String.format("%.2f", fome)+"\nSaude: "+String.format("%.2f", saude)
		+"\nTédio: "+String.format("%.2f", tedio));
	}
	
	static public void main(String[] args) {
		List<Bichinhovirtual> Fazenda = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		
		short choice;
		int total = 0, choice2, choice3;
		do {
			System.out.print("0-Sair\n1-Adicionar Bichinho\n2-Porta Escondida\n3-Brincar\n4-Comer\nEscolha: ");
			choice = in.nextShort();
			
			switch(choice) {
			case 1:
				System.out.println("(Nome, Idade)?");
				Fazenda.add(new Bichinhovirtual(in.next(),in.nextInt()));
				total++;
				break;
			case 2:
				for(int i=0;i<total;i++) {
					System.out.println(i+" - "+Fazenda.get(i).getNome());
				}
				System.out.print("Escolha: ");
				choice2 = in.nextInt();
				Fazenda.get(choice2).str();
				break;
			case 3:
				for(int i=0;i<total;i++) {
					System.out.println(i+" - "+Fazenda.get(i).getNome());
				}
				System.out.print("Escolha: ");
				choice2 = in.nextInt();
				System.out.print("Quanto tempo(h): ");
				choice3 = in.nextInt();
				Fazenda.get(choice2).brincar(choice3);;
				break;
			case 4:
				for(int i=0;i<total;i++) {
					System.out.println(i+" - "+Fazenda.get(i).getNome());
				}
				System.out.print("Escolha: ");
				choice2 = in.nextInt();
				System.out.print("Dar comida: ");
				choice3 = in.nextInt();
				Fazenda.get(choice2).comer(choice3);;
				break;
			}
			
		}while(choice!=0);
	}
}
