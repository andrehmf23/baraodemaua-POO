package library_system;

import java.util.Scanner;
import java.util.Date;

public class Someone {
	
	Scanner scan = new Scanner(System.in);
	
	String name = "";
	long cpf = 0;
	Date Loandate, Expirationdate;
	
	public void printInformation() {
		System.out.println("Nome: " + name);
		System.out.println("Cpf: " + cpf);
		System.out.println("Data do empréstimo: " + Loandate);
		System.out.println("Data de vencimento: " + Expirationdate);
	}
	
	@SuppressWarnings("deprecation")
	public void setPeople() {
		System.out.println("Nome: ");
		name = scan.next();
		System.out.println("Cpf: ");
		cpf = scan.nextLong(11);
		Loandate = new Date();
		Expirationdate = new Date();
		
		int Day, Month, Year;
		System.out.println("Tempo de empréstimo em dias: ");
		Day = scan.nextInt();
		
		Day = Day + Loandate.getDate();
		Month = Loandate.getMonth();
		Year = Loandate.getYear();
		int CountM, CountY;
		for (CountM = 0; Day > 28; CountM++) {
			Day = Day - 28;
		}
		Month = Month + CountM;
		for (CountY = 0; Month > 12; CountY++) {
			Month = Month - 12;
		}
		Year = Year + CountY;
		
		Expirationdate.setDate(Day);
		Expirationdate.setMonth(Month);;
		Expirationdate.setYear(Year);
	}
	
}
