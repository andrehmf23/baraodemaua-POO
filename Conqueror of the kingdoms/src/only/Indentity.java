package only;

import animals.*;
import actionunits.*;
import attackunits.*;
import kingdoms.Castle;
import kingdoms.Kingdom;

import java.util.ArrayList;
import java.util.List;

import Structures.*;

public class Indentity {
	
	public Entity generateAnimals(int data, int x, int y){
		switch (data) {
		case 1:
			return new Cow(x,y);
		case 2:
			return new Sheep(x,y);
		}
		return null;
	}
	
	public Collectable generateCollectable(int data, int x, int y){
		switch (data) {
		case 1:
			return new Tree(x,y);
		case 2:
			return new Boulder(x,y);
		}
		return null;
	}
	
	public Entity createUnits(int data, int Kingdom, int x, int y, Kingdom Kprice) {
		switch (data) {
		case 1:
			Kprice.spendLeather(5);
			Kprice.spendWood(10);
			Kprice.spendFood(10);
			Kprice.spendGold(5);
			return new Archer(Kingdom,x,y);
		case 2:
			Kprice.spendFood(15);
			Kprice.spendStone(5);
			Kprice.spendLeather(5);
			Kprice.spendGold(5);
			return new Cavalry(Kingdom,x,y);
		case 3:
			Kprice.spendFood(10);
			Kprice.spendWood(5);
			Kprice.spendStone(5);
			Kprice.spendLeather(5);
			Kprice.spendGold(5);
			return new Lancer(Kingdom,x,y);
		case 4:
			Kprice.spendFood(10);
			Kprice.spendStone(10);
			Kprice.spendLeather(5);
			Kprice.spendGold(5);
			return new Paladin(Kingdom,x,y);
		default:
			break;
		}
		return null;
	}
	
	public Building createBuilding(int data, int Kingdom, int x, int y, Kingdom Kprice) {
		switch (data) {
		case 1:
			Kprice.spendWood(10);
			Kprice.spendStone(5);
			return new Goldmine(Kingdom,x,y);
		case 2:
			Kprice.spendWood(15);
			Kprice.spendGold(5);
			return new House(Kingdom,x,y);
		default:
			break;
		}
		return null;
	}
	
	public Barracks createBarracks(int data, int Kingdom, int x, int y, Kingdom Kprice) {
		Kprice.spendWood(10);
		return new Barracks(Kingdom,x,y);
	}
}
