package attackunits;
import only.Entity;

public class Cavalry extends Entity{
	public Cavalry(int Kingdom, int x, int y) {
		this.x = x;
		this.y = y;
    	this.Kingdom = Kingdom;
		rep = 'C';
		hp = maxhp = 35;
		damage = 5;
		speed = 2;
		value = 2;
		Atkspeed=2;
	}
}
