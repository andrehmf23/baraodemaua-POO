package animals;

import creature.Animals;
import creature.Creature;

public class Cow extends Creature implements Animals{

	@Override
	public void Sound() {
		System.out.println("Muuuu...");
	}
	
	
}
