package cap07;

public class Gps {
	private String idioma, rota;
	
	public Gps() {};
	
	public Gps(String rota) {
		idioma = "Português";
		this.rota = rota;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}
	
	public void Show() {
		System.out.print("Idioma: " + idioma + " Rota: " + rota);
	}
}
