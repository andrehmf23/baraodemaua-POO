package extra;

import java.util.Scanner;

import square.Square;

public class extra {
	public static Scanner scan = new Scanner(System.in);
	static public void main(String[] args)
	{
		Square obj = new Square();
		short selection = 0;
		do {
			System.out.println("0-Sair\n1-Função1\n2-Função2\n3-Função3");
			System.out.print("Selecione a opção: ");
			selection = scan.nextShort();
			
			switch (selection) 
			{
			case 1:
				System.out.print("Insira: ");
				double number = scan.nextDouble();
				obj.setSidesize(number);
				break;
			case 2:
				System.out.println(obj.getSidesize());
				break;
			case 3:
				System.out.println(obj.getArea());
				break;
			}
		}while (selection != 0);
	}
}
