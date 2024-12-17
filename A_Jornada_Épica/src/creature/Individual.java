package creature;

import java.util.ArrayList;

public class Individual extends Creature implements Aggressiveness{
	
	public Individual(String name, String race, String class_c) {
		this.name = name;
		this.race = race;
		this.class_c = class_c;
		Skills = new ArrayList<>();
	}
	
	@Override
	public void Attack(Creature target) {
		protect = false;
		if(target.protect)target.hp -= (int) (damage/2);
		else target.hp -= damage;
	}
	
	public void Defense() {
		protect = true;
		
	}

	@Override
	public void NewSkill() {
		
	}

	@Override
	public void UpdateSkill() {
		// TODO Auto-generated method stub
		
	}

}
