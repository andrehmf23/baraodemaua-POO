package Car;

public class Car {
	 	private float cosumption, fuel;
	 	
	 	public Car(float comsuption) {
	 		this.cosumption = comsuption;
	 		fuel = 0;
	 	}
	 	
	 	//cosumo = km / litro | cosumo*litro = km | litro = km / consumo |
	 	
	 	public void Andar(float km) {
	 		fuel -= km / cosumption;
	 	}

		public float getFuel() {
			return fuel;
		}

		public void setFuel(float fuel) {
			this.fuel = fuel;
		}
}
