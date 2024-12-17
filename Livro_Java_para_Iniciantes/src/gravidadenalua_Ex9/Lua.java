package gravidadenalua_Ex9;

import java.util.Scanner;

public class Lua {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite seu peso: ");
		float x = scanner.nextFloat();
		x = (float) (x * 0.17);
		System.out.println("Seu peso na lua é: " + x);
	}
}
