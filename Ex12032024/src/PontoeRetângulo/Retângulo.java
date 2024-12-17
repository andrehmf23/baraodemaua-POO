package PontoeRetângulo;

import java.util.Scanner;

public class Retângulo {
	private double altura, largura; 
	private Ponto[] point = new Ponto[4];
	
	public void setRetângulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		for (int i = 0; i < 4; i++) {
			point[i] = new Ponto();
		}
		point[0].setY(altura);
		point[1].setY(altura);
		point[1].setX(largura);
		point[3].setX(largura);
	}
	
	public Ponto FindCenter() {
		Ponto save = new Ponto();
		save.setX(largura/2);
		save.setY(altura/2);
		return save;
	}
	
	public void MostrarVertices() {
		for (int i=0; i<4; i++) {
			point[i].PrintPonto();
		}
	}
	
	public static Scanner scan = new Scanner(System.in);

	static public void main(String[] args) {
		Retângulo r1 = new Retângulo();
		
		short c;
		do {
			System.out.print("0-Sair\n1-Modificar retângulo\n2-Centro de retângulo\nEscolha: ");
			c = scan.nextShort();
			switch (c) {
			case 1:
				System.out.print("Insira o tamanho do retângulo(altura,largura): ");
				double altura = scan.nextDouble();
				double largura = scan.nextDouble();
				r1.setRetângulo(altura, largura);
				break;
			case 2:
				Ponto p = r1.FindCenter();
				p.PrintPonto();
				break;
			}
		}while(c!=0);
		
	}
}
