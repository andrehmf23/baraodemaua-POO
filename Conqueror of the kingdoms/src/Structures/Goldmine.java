package Structures;

public class Goldmine extends Building {
    public Goldmine(int Kingdom, int x, int y) {
    	this.x = x;
		this.y = y;
    	this.Kingdom = Kingdom;
        this.rep = 'M';
        this.hp = 10;
        this.resource = 100;// Gera uma quantidade de ouro.
    }
}
