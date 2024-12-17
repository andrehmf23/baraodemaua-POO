package animals;

import only.Entity;

public class Cow extends Entity{
    public Cow(int x, int y) {
    	this.x = x;
		this.y = y;
        hp = maxhp = 15;
        rep ='C';
        
    }
}