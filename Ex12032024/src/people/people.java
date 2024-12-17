package people;

public class people {
	private String nome;
	private int idade;
	private float peso, altura;
	
	public void Engordar() {
		peso++;
	}
	public void Envelhecer() {
		idade++;
		Crescer();
	}
	public void Emagrecer() {
		peso--;
	}
	public void Crescer() {
		if (idade < 21) {
			altura += 0.5;
		}
	}
}
