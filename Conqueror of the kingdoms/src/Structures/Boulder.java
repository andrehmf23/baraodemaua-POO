package Structures;

public class Boulder extends Collectable {
    public Boulder(int x, int y) {
    	this.x = x;
		this.y = y;
        this.rep = 'B';
        this.resource = 2;
        this.hp = 20;
    }
}
