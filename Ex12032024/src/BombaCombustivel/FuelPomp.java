package BombaCombustivel;

public class FuelPomp {
	private String typeFuel;
	private double valueLiters;
	private double quantityFuel;
	
	public void supplyPerValue(double value) {
		value = value / valueLiters;
		quantityFuel -= value;
		System.out.print("Quantity put: " + value);
	}
	
	public void supplyPerLiters(double liters) {
		quantityFuel -= liters;
		liters = liters * valueLiters;
		System.out.print("Value Quantity: " + liters);
	}
	
	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}
	public void setValueLiters(double valueLiters) {
		this.valueLiters = valueLiters;
	}
	public void setQuantityFuel(double quantityFuel) {
		this.quantityFuel = quantityFuel;
	}
}
