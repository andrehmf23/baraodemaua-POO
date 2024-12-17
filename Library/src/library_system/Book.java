package library_system;

import java.util.Date;

//import library_system.Someone;

public class Book {
	private String name;
	private Date dateregister;
	private boolean borrowed;
	private Someone loan = new Someone();
	
	Book(String name){
		this.name = name;
		this.dateregister = new Date();
		borrowed = false;
	}
	
	public void printInformation() {
		System.out.println("Name: " + name);
		System.out.println("Date: " + dateregister);
		System.out.println("Emprestado: " + borrowed);
		
		if (borrowed) {
			loan.printInformation();
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void CreateLoan() {
		borrowed = true;
		loan.setPeople();
	}
	
	public void DeleteLoan() {
		borrowed = false;
	}
}
