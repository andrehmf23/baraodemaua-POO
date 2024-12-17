package system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import directory.FileHandler;
import entities.Role;
import entities.RoleManager;
import entities.User;

public class Database {
	
	private static Scanner scan = new Scanner(System.in);
	private User login = null;
	private List<User> users = null;
	private RoleManager rolemanager = new RoleManager();
	private FileHandler<List<User>> file = new FileHandler<List<User>>("database.dat");
	
	public Database() {
		try {
			users = file.read();
		}
		catch (Exception e){
			System.out.println("Exception: " + e);
		}
		
		if (users == null) {
			users = new ArrayList<User>();
		}
		
		if (users.isEmpty()) {
			users.add(new User(0, new Role("admin", 1), null, "admin", "123", null));
			file.save(users);
		}
	}
	
	public void login() {
		
		System.out.println("Digite o nome: ");
	    String name = scan.nextLine();

	    System.out.println("Digite o senha: ");
	    String key = scan.nextLine();
	    
	    boolean verify = false;
		for (int i = 0; i < users.size(); i++) {
			User user = this.users.get(i);
			if (user.getName().equals(name) && user.getKey().equals(key)) {
				verify = true;
				this.login = user;
				break;
			}
		}
		
		if (verify) {
			System.out.println("Login realizado com sucesso!");
		}
		else {
			System.out.println("Login falhou!");
		}
	}
	
	public void addUser() {
		
		Role role = null; // Defina o papel (Role) corretamente
		if (login != null) {
			RoleManager manager = new RoleManager();
			
			System.out.print("Qual level de acesso: ");
			
			role = manager.createRole(login.getRole(), scan.nextInt());
		}

	    System.out.print("Digite o CPF: ");
	    String CPF = scan.nextLine(); // Use nextLine() para ler toda a linha do CPF

	    System.out.print("Digite o nome: ");
	    String name = scan.nextLine(); // Use nextLine() para ler o nome completo

	    System.out.print("Digite o senha: ");
	    String key = scan.nextLine();

	    System.out.print("Digite o ano de nascimento: ");
	    int ano = scan.nextInt();
	    System.out.print("Digite o mês de nascimento: ");
	    int mes = scan.nextInt();
	    System.out.print("Digite o dia de nascimento: ");
	    int dia = scan.nextInt();
	    
	    LocalDate date_nasc = LocalDate.of(ano, mes, dia); // Crie LocalDate com of()

	    User user = new User(this.users.size(), role, key, CPF, name, date_nasc); // Gere o ID
	    this.users.add(user);
	    file.save(users);
	}

	public void removeUser(int id) {
		this.users.removeIf(user -> user.getId() == id);
		file.save(users);
	}
	
	public void Show() {
		for (int i = 0; i < users.size(); i++) {
			users.get(i).Show();
		}
	}
}
