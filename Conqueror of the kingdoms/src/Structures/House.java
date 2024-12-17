package Structures;

public class House extends Building {
	//Aumento da população será feito no map
    public House(int Kingdom, int x, int y) {
    	this.x = x;
		this.y = y;
    	this.Kingdom = Kingdom;
        this.rep = 'H';
        this.hp = 10;
    }
}
