package animals;

import creature.Animals;
import creature.Creature;

public class Lobo extends Creature implements Animals{

	@Override
	public void Sound() {
		System.out.println("Auuuu...");
	}
	
	
}
