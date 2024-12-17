package entities;

public class Role {
	
	private final int level;
	private String name;

	public Role(String name, int acess_level) {
		this.name = name;
		this.level = acess_level;
	}

	int getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}
	
	public void Show() {
		System.out.println("Role: " + this.name + " | " + this.level);
	}
}

