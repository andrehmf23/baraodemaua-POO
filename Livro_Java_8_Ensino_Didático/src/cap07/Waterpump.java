package cap07;

public class Waterpump {
	boolean status;

	
	public void On(int segundos) throws InterruptedException {
		status = true;
		System.out.println("Status:"+status);
		Thread.sleep(segundos*1000); // Aguarda 1 segundo entre cada número
		Off();
	}
	
	public void Off() {
		status = false;
		System.out.println("Status:"+status);
	}
	
}
