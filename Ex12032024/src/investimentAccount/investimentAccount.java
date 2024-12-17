package investimentAccount;

public class investimentAccount {
	private float taxajuros, saldoinicial;
	
	public investimentAccount(float taxajuros, float saldoinicial) {
		this.taxajuros = taxajuros; 
		this.saldoinicial = saldoinicial;
	}
	
	public void Adicionejuros(float taxajuros) {
		this.taxajuros += taxajuros;
	}
	
	public void Saldo() {
		System.out.print(saldoinicial+((saldoinicial*taxajuros)/100));
	}
	
	static public void main(String[] args) {
		investimentAccount c1 = new investimentAccount(10,1000);
		c1.Saldo();
	}
	
}
