package attackunits;
import only.Entity;

public class Archer extends Entity{
	public Archer(int Kingdom, int x, int y) {
		this.x = x;
		this.y = y;
    	this.Kingdom = Kingdom;
		rep = 'A';
		hp = maxhp = 20;
		damage = 5;
		range = 4;
		Atkspeed=6;
	}
}
