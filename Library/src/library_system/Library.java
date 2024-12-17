package library_system;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	public static Scanner scan = new Scanner(System.in);
	private static ArrayList<Book> Books = new ArrayList<Book>();
	
	static public void main(String[] args)
	{
		boolean open = true;
		int counter = 0;
		
		while (open) {
			
			System.out.println("Abrindo Sistema...");
			System.out.println("1.Registrar Livro");
			System.out.println("2.Visualizar Livros");
			System.out.println("3.Empréstimo");
			System.out.println("4.Concluir Empréstimo");
			System.out.println("5.Close");
			System.out.print("Escolha: ");
			
			short option = scan.nextShort();
			System.out.print('\n');
			switch (option) {
			case 1:
				System.out.print("Nome do Livro: ");
				String name = scan.next();
				Books.add(new Book(name));
				counter++;
				break;
			case 2:
				System.out.println("Lista de livros: ");
				for (int i=0; i<counter;i++) {
					System.out.println(i + ". " + Books.get(i).getName());
				}
				System.out.print("Escolha: ");
				Books.get(scan.nextInt()).printInformation();
				break;
			case 3:
				if(counter == 0) {
					System.out.println("Nenhum livro registrado!");
					break;
				}
				
				for (int i=0; i<counter;i++) {
					System.out.println(i + ". " + Books.get(i).getName());
				}
				
				System.out.print("Escolha: ");
				int choice = scan.nextInt();
				
				if (choice < counter && choice >= 0) {					
					Book Temp = Books.get(choice);
					Temp.CreateLoan();
					Books.set(choice,Temp);
				}
				else System.out.println("Livro não encontrado!");

				break;
			case 4:
				if(counter == 0) {
					System.out.println("Nenhum livro registrado!");
					break;
				}
				
				for (int i=0; i<counter;i++) {
					System.out.println(i + ". " + Books.get(i).getName());
				}
				
				System.out.print("Escolha: ");
				choice = scan.nextInt();
				
				if (choice < counter && choice >= 0) {					
					Book Temp = Books.get(choice);
					Temp.DeleteLoan();
					Books.set(choice, Temp);
				}
				else System.out.println("Livro não encontrado!");

				break;
			case 5:
				open = false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
			
			System.out.print("\n");			
		}
		scan.close();
		System.out.println("Sistema fechado!");
	}
}

