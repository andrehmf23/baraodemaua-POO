package main;

import java.io.IOException;
import java.util.Scanner;
import File.ControlFile;
import Text.Phrases;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public void Print(String Content) {
		System.out.print(Content);
	}
	
	
	public static void main(String[] args){
		Phrases p = new Phrases();
		p.start();
		
		
		Main m = new Main();
		m.Print("Teste");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		short select = 0, select2 = 0;
		short nPlayer=1, nBots=1;
		
		while (select!=3) {
			System.out.println("_______________________Conquistadores_do_Reino_______________________");
			System.out.println("1.Iniciar jogo\n2.Configurar jogo\n3.Sair");
			System.out.print("Digite sua escolha: ");
			select = scan.nextShort();
			switch(select) {
			case 1:
				System.out.println("1.Novo jogo\n2.Carregar jogo\n3.Voltar");
				System.out.print("Digite sua escolha: ");
				select2 = scan.nextShort();
				
				if(select2 == 1) {
					System.out.println("Criando mapa...");
					Map map = new Map();
					System.out.println("Alterando valores...");
					map.setnBots(nBots);
					map.setnPlayer(nPlayer);
					System.out.println("Iniciando...");
					map.run();
					map.save();
				}
				else if (select2 == 2) {
					Map map;
					//map.saveRun();
				}
				break;
			case 2:
				System.out.println("1.Número de jogadores\n2.Número de bots\n3.Voltar");
				System.out.print("Digite sua escolha: ");
				select2 = scan.nextShort();
				
				if(select2 == 1) {
					System.out.print("\nQuantidade: ");
					nPlayer = scan.nextShort();
					if(nPlayer < 1) nPlayer = 1;
					else if (nPlayer > 4) nPlayer = 4;
				}
				else if (select2 == 2) {
					System.out.print("\nQuantidade: ");
					nBots = scan.nextShort();
					if(nBots < 1) nBots = 1;
					else if (nBots > 4) nBots = 4;
				}
				break;
			case 3:
				break;
			}
		}
    }
}
