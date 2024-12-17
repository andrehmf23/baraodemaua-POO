package contacorrente;

public class Contacorrente {
	private String name;
	private int account;
	private float saldo;

	public void setName(String name) {
		this.name = name;
	}

	public float getSaque(float saque) {
		return saldo - saque;
	}

	public void setDeposito(float saldo) {
		this.saldo += saldo;
	}

	public Contacorrente(String name, int account, float saldo) {
		this.name = name;
		this.account = account;
		this.saldo = saldo;
	}
}
