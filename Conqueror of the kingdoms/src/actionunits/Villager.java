package actionunits;
import only.Entity;

public class Villager extends Entity{//HP varia (0~100) Damage (0~35) Ex:"Aldeão(villager) hp:18 maxhp:20 damage:2 range:1"
	public Villager(int Kingdom, int x, int y) {
		this.x = x;
		this.y = y;
		this.Kingdom = Kingdom;
		rep = 'V';
		maxhp = hp = 20;
		damage = 3;
	}
}
