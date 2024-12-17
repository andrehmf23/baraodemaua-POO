package rectangle;

import java.util.Scanner;

public class Rectangle {
	private float ladoA, ladoB;
	
	public void Mudarvalordosdados(float ladoA, float ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	public float getLadoA() {
		return ladoA;
	}
	public float getLadoB() {
		return ladoB;
	}
	public float getCalcularPerimetro() {
		return ladoA*2+ladoB*2;
	}
	public float getCalcularArea() {
		return ladoA*ladoB;
	}

	public static Scanner scan = new Scanner(System.in);

	static public void main(String[] args)
	{
		System.out.print("Medida do ladoA e ladoB: ");
		Rectangle obj = new Rectangle();
		obj.Mudarvalordosdados(scan.nextFloat(), scan.nextFloat());
		System.out.print("Area: " + obj.getCalcularArea() + " Perimetro: " + obj.getCalcularPerimetro());
		
	}
}
