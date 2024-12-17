package only;

public class Existence {
	protected int hp, maxhp, damage;
	protected int x, y; //Posição
	protected char rep; //Representação
	protected int Kingdom;//nome do reino pertencente
	
	public Existence(){
		Kingdom = hp = maxhp = x = y = 0;
		rep = '♾';
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public char getRep() {
		return rep;
	}
	
	public void showAttributes() {
		System.out.println("Hp: " + hp);
		System.out.println("MaxHp: " + maxhp);
		System.out.println("X: " + x + " Y: " + y);
		System.out.println("Rep: " + rep);
		System.out.println("Kingdom: " + Kingdom);
	}
	
}
