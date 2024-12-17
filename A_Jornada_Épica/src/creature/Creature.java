package creature;
import java.util.ArrayList;
import java.util.List;

import skill.Skill;

public class Creature {
	protected static List<Skill> Skills;
	
	protected Boolean protect;
	protected String name;
	protected int level;
	protected int hp, armor;
	protected int damage;
	protected int speed;
	protected String race, class_c;
	
	public void Defense() {
		protect = true;
		waitDefense(2000);
	};
	
	public void waitDefense(int x) {
		try {
			Thread.sleep(x);
			protect = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
