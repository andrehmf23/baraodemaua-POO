package square;

public class Square {
	private double sidesize;
	
	public double getSidesize() {
		return sidesize;
	}
	public void setSidesize(double sidesize) {
		this.sidesize = sidesize;
	}
	public double getArea() {
		return this.sidesize*this.sidesize;
	}
}
