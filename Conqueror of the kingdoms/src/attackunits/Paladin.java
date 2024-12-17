package attackunits;
import only.Entity;

public class Paladin extends Entity{
	public Paladin(int Kingdom, int x, int y) {
		this.x = x;
		this.y = y;
    	this.Kingdom = Kingdom;
		rep = 'P';
		hp = maxhp = 60;
		damage = 5;
		Atkspeed=8;
	}
}
