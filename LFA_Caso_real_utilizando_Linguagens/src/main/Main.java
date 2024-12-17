package main;

import java.util.Scanner;

import Filter.Filter;
import system.Database;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	
    public static void main(String args[]) {
    	
    	
    	Filter f = new Filter();
    	System.out.println(f.run("555.555.555-55"));
    	
    	
    	Database data = new Database();
    	
    	int select = -1;
    	while (select != 0) {
			System.out.print(
					  "1.Adicionar usuário\n"
					+ "2.Remover usuário\n"
					+ "3.Mostrar usuários\n"
					+ "4.Login\n"
					+ "0.Sair\n"
					+ "Selecione: ");
			select = scan.nextInt();
    		switch (select) {
    		case 0:
    			System.out.println("Saindo do sistema!");
    			break;
    		case 1:
    			System.out.println("Criando usuário...");
    			data.addUser();
    			break;
    		case 2:
    			System.out.println("Removendo usuário...");
    			data.removeUser(select);
    			break;
    		case 3:
    			System.out.println("Mostrar usuários...");
    			data.Show();
    			break;
    		case 4:
    			System.out.println("Ralizando Login...");
    			data.login();
    			break;
    		case 5:
    			System.out.print("Saindo do sistema!");
    			break;
    		case 6:
    			System.out.print("Saindo do sistema!");
    			break;
    		case 7:
    			System.out.print("Saindo do sistema!");
    			break;
    		case 8:
    			System.out.print("Saindo do sistema!");
    			break;
    		}
    	}
    }
}
