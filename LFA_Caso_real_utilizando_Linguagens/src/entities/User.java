package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Role role;
	private String CPF;
	private String name;
	private String key;
	private LocalDate date_nasc;
	private Date dateRegister;
	
	public User(int id, Role role, String CPF, String name, String key, LocalDate date_nasc) {
		this.id = id; 
		this.CPF = CPF;
		this.role = role;
		this.name = name;
		this.key = key;
		this.date_nasc = date_nasc;
		this.dateRegister = new Date();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public int getId() {
		return id;
	}

	public Role getRole() {
		return role;
	}

	public String getCPF() {
		return CPF;
	}

	public String getName() {
		return name;
	}

	public String getKey() {
		return key;
	}

	public LocalDate getDate_nasc() {
		return date_nasc;
	}

	public Date getDateRegister() {
		return dateRegister;
	}
	
	public void Show() {
		try {			
			System.out.println("ID: " + this.getId());
			System.out.println("CPF: " + this.getCPF());
			System.out.println("Nome: " + this.getName());
			this.getRole().Show();
			System.out.println("Data de Registro: " + this.getDateRegister());
		}
		catch (NullPointerException e) {
			
		}
    }
}
