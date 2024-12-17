package TV;

public class TV {
	private float canal;
	private int som;
	
	public void Aumentar()
	{
		if(som<100) {
			som++;
		}
	}
	
	public void Diminuir()
	{
		if(som>0) {
			som--;
		}
	}
	
	public void Canal(float canal) {
		this.canal = canal;
	}
}
