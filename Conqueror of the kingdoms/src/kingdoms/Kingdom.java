package kingdoms;

public class Kingdom {
	private String name = "None";
	private Boolean bot = true;
	private int gold, food, wood, stone, leather, population, maxpopulation;//ouro, comida, madeira, pedra, couro
	
	public Kingdom(String name, Boolean bot){
		this.name = name;
		this.bot = bot;
		gold = food = wood = stone = leather = 20;
		population = maxpopulation = 0;
	}
	
	//Gastar Recursos
	public void spendGold(int gold) {
		this.gold -= gold;
	}

	public void spendFood(int food) {
		this.food -= food;
	}

	public void spendWood(int wood) {
		this.wood -= wood;
	}
	
	public void spendStone(int stone) {
		this.stone -= stone;
	}

	public void spendLeather(int leather) {
		this.leather -= leather;
	}

	public void spendPopulation(int population) {
		this.population -= population;
	}
	
	public void spendMaxpopulation(int maxpopulation) {
		this.maxpopulation -= maxpopulation;
	}
	
	//Receber Recursos
	public void receiveGold(int gold) {
		this.gold += gold;
	}

	public void receiveFood(int food) {
		this.food += food;
	}

	public void receiveWood(int wood) {
		this.wood += wood;
	}
	
	public void receiveStone(int stone) {
		this.stone += stone;
	}

	public void receiveLeather(int leather) {
		this.leather += leather;
	}

	public void receivePopulation(int population) {
		this.population += population;
	}
	
	public void receiveMaxpopulation(int maxpopulation) {
		this.maxpopulation += maxpopulation;
	}



	public void showResource() {
		System.out.println("Reino: " + name + " G:" + gold + " F:" + food + " W:" + wood + " G:" + stone + " L:" + leather + " P:" + population);
	}
}