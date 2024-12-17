package main;

import only.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Structures.*;
import animals.*;
import attackunits.Lancer;
import kingdoms.*;

public class Map {
	
	private int sx=25, sy=15;
	private char vetor[][] = new char [sy][sx];
	private short nPlayer=1, nBots=1;
	
	private static List<Entity> EntityList = new ArrayList<>();
	private static List<Barracks> BarracksList = new ArrayList<>();
	private static List<Collectable> CollectableList = new ArrayList<>();
	private static List<Castle> CastleList = new ArrayList<>();
	private static List<Building> BuildingList = new ArrayList<>();
	private static List<Kingdom> KingdomList = new ArrayList<>();
	
	public static Scanner scan = new Scanner(System.in);
	
	protected Map(){//Geração do mapa
		
		Random rand = new Random();
		
		//update vetor já deixa em branco se não encontrar nada
		/*
		for(int i = 0; i < 15; i++){
			for(int j= 0; j < 15; j++){
				vetor[i][j] = ' ';
			}
		}
		*/
	}

	public void run() {//Controlador do inicio de jogo
		
		for (int i = 0; i<nPlayer; i++) { // setPlayer and setPositionofCastle
			System.out.print("Escolha o nome do reino do player " + i + ": ");
			KingdomList.add(new Kingdom(scan.next(),false));
			
			System.out.print("Escolha a posição(x,y) do reino do player " + i + ": ");
			CastleList.add(new Castle(i,scan.nextInt(),scan.nextInt()));
		}
		
		System.out.println();
		
		for (int i = 0; i<nBots; i++) {	// setBot and setPositionofCastle	
			System.out.print("Definindo nome do Bot para Bot" + i);
			KingdomList.add(new Kingdom("Bot"+i,true));
			
			System.out.println("Escolha a posição(x,y) do reino do Bot " + i + ": ");
			CastleList.add(new Castle(i,scan.nextInt(),scan.nextInt()));
		}
		
		
		EntityList.add(new Cow(0,0));
		EntityList.add(new Lancer(0 ,2, 3));
		Map map = new Map();
		map.updateAndShowVetor();
		
		Entity temp = EntityList.get(0);
		temp.move(2, 2);
		EntityList.set(0, temp);
		
		map.updateAndShowVetor();
		
		while(KingdomList.size()!=1) {
			
			//Players
			for (int i = 0; i<nPlayer; i++) {
				
				int c1=0, c2;
				int counter = 2;
				Indentity id = new Indentity();
				while(c1!=4&&counter>0) {
					KingdomList.get(i).showResource();
					map.updateAndShowVetor();
					System.out.println("1. Construir");
					System.out.println("2. Analisar");
					System.out.println("3. Movimentar e atacar");
					System.out.println("4. Contruir tropas");
					System.out.println("5. Finalizar");
					c1 = scan.nextInt();
					switch (c1) {
					case 1:
						System.out.println("Tipos de contrução: ");
						System.out.println("1. Goldmine");
						System.out.println("2. House");
						System.out.println("3. Barracks");
						System.out.println("4. Cancelar");
						c2 = scan.nextInt();
						Kingdom tmp = KingdomList.get(i);
						System.out.println("Digite as cordenadas(x,y): ");
						if (c2>=1&&c2<=2) {
							BuildingList.add(id.createBuilding(c2, i, scan.nextInt(), scan.nextInt(), tmp));
						}
						else if (c2==3) {
							BuildingList.add(id.createBarracks(c2, i, scan.nextInt(), scan.nextInt(), tmp));
						}
						KingdomList.set(i, tmp);
						break;
					case 2:
						System.out.println("Digite as cordenadas(x,y): ");
						positionShow(scan.nextInt(),scan.nextInt());
						break;
					case 3:
						System.out.println("Digite as cordenadas(x,y) da entidade: ");
						MoveAndAttack(scan.nextInt(),scan.nextInt());
						break;
					case 4:
						System.out.println("Digite as cordenadas(x,y) da entidade: ");
						Barracks Barrack = BarracksList.get(elementPosition(scan.nextInt(),scan.nextInt(),BarracksList));
						System.out.println("Digite o tipo de unidade: ");
						System.out.println("1. Archer");
						System.out.println("2. Cavalry");
						System.out.println("3. Lancer");
						System.out.println("4. Paladin");
						Barrack.AddUnit(scan.nextInt());
						BarracksList.set(elementPosition(scan.nextInt(),scan.nextInt(),BarracksList), Barrack);
						break;
					default:
						break;
					}
					counter--;
				}
			}
			
			//Addbots
			//AddUpdateAll
			
			try {
			    Thread.sleep(1000); // 1000 milissegundos é igual a 1 segundo
			} catch (InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
	}
	
	public void save() {//salvamento do jogo
		
	}

	public void saveRun() {//salvamento do jogo
	
	}
	
	public boolean elementExist(int i, int j, List <? extends Existence> ExistenceList) {//Caça objetos existentes na posição i j, e atualiza se sim
		for(int k=0; k<ExistenceList.size(); k++) {
			if(ExistenceList.get(k).getX()==j&&ExistenceList.get(k).getY()==i) {
				return true;
				}
			}
		return false;
	}
	
	public int elementPosition(int x, int y, List <? extends Existence> ExistenceList) {//Caça objetos existentes na posição i j, e atualiza se sim
		for(int k=0; k<ExistenceList.size(); k++) {
			if(ExistenceList.get(k).getX()==x&&ExistenceList.get(k).getY()==y) {
				return k;
				}
			}
		return 0;
	}
	
	public void MoveAndAttack(int x, int y) {//Caça objetos existentes na posição x y
		for(int k=0; k<EntityList.size(); k++) {
			if(EntityList.get(k).getX()==x&&EntityList.get(k).getY()==y) {
				System.out.println("Digite as cordenadas(x,y) do alvo: ");
				int targetx = scan.nextInt();
				int targety = scan.nextInt();
				Entity tmp = EntityList.get(k);
				if(elementExist(targetx,targety,EntityList)) {
					Entity target = EntityList.get(elementPosition(targetx,targety,EntityList));
					tmp.attack(target);
					EntityList.set(elementPosition(targetx,targety,EntityList),target);
				}
				else if(elementExist(targetx,targety,BarracksList)) {
					Barracks target = BarracksList.get(elementPosition(targetx,targety,BarracksList));
					tmp.attack(target);
					BarracksList.set(elementPosition(targetx,targety,BarracksList),target);
				}
				else if(elementExist(targetx,targety,CollectableList)) {
					Collectable target = CollectableList.get(elementPosition(targetx,targety,CollectableList));
					tmp.attack(target);
					CollectableList.set(elementPosition(targetx,targety,CollectableList),target);
				}
				else if(elementExist(targetx,targety,BuildingList)) {
					Building target = BuildingList.get(elementPosition(targetx,targety,BuildingList));
					tmp.attack(target);
					BuildingList.set(elementPosition(targetx,targety,BuildingList),target);
				}
				else if(elementExist(targetx,targety,CastleList)) {
					Castle target = CastleList.get(elementPosition(targetx,targety,CastleList));
					tmp.attack(target);
					CastleList.set(elementPosition(targetx,targety,CastleList),target);
				}
				else {
					tmp.move(targetx, targety);
				}
				EntityList.set(k, tmp);
			}
		}
	}
	
	public boolean findAndUpdate(int i, int j, List <? extends Existence> ExistenceList) {//Caça objetos existentes na posição i j, e atualiza se sim
		for(int k=0; k<ExistenceList.size(); k++) {
			if(ExistenceList.get(k).getX()==j&&ExistenceList.get(k).getY()==i) {
				vetor[i][j] = ExistenceList.get(k).getRep();
				return true;
				}
			}
		return false;
	}
	
	public boolean elementInPosition(int i, int j) { //Verifica se achou elemento na posição
		return findAndUpdate(i,j,EntityList) || findAndUpdate(i,j,CollectableList) ||
			   findAndUpdate(i,j,BuildingList) || findAndUpdate(i,j,BarracksList) || findAndUpdate(i,j,CastleList);//New
	}
	
	public void updateVetor(){//Percorre a matriz para atualizar os valores dela
		for (int i=0;i<sy;i++) {
			for (int j=0;j<sx;j++) {
				
				if (!elementInPosition(i,j)) vetor[i][j] = '-';//chão/background
				}
			}
	}
	
	
	public void findAndShow(int x, int y, List <? extends Existence> ExistenceList) {//Caça objetos existentes na posição x y e mostra atributo
		for(int k=0; k<ExistenceList.size(); k++) {
			if(ExistenceList.get(k).getX()==x&&ExistenceList.get(k).getY()==y) {
				ExistenceList.get(k).showAttributes();
				}
			}
	}
	
	public void positionShow(int x, int y) { //Verifica se achou elemento na posição e mostra
		findAndShow(x,y,EntityList); 
		findAndShow(x,y,CollectableList);
		findAndShow(x,y,BuildingList);
		findAndShow(x,y,BarracksList);
		findAndShow(x,y,CastleList);
	}
	
	
	public void showVetor(){//Mostra vetor
		
		System.out.println();
		
		for (int i=0;i<sy;i++) {
			System.out.print(String.format("%-2s | ",i));
			for (int j=0;j<sx;j++) {
				System.out.print(vetor[i][j] + " ");
				}
			System.out.print("|\n");
		}
		System.out.println();
	}
	
	public final static void clearConsole()//limpar tela
	{
		for(int clear = 0; clear < 1000; clear++)
		{
		     System.out.println();
		}
	}
	
	public void updateAndShowVetor() {//new
		//clearConsole();
		updateVetor();
		showVetor();
	}

	public void setnPlayer(short nPlayer) {
		this.nPlayer = nPlayer;
	}

	public void setnBots(short nBots) {
		this.nBots = nBots;
	}
	
}
