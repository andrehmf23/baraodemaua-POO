package attackunits;
import only.Entity;

public class Lancer extends Entity{
	public Lancer(int Kingdom, int x, int y) {
		this.x = x;
		this.y = y;
    	this.Kingdom = Kingdom;
		rep = 'L';
		maxhp = hp = 40;
		damage = 10;
		Atkspeed=4;
	}
}
