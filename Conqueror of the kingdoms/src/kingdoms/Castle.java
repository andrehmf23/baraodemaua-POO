package kingdoms;

import only.Existence;

public class Castle extends Existence{
	
	public Castle(int kingdom, int x, int y){
		this.x = x;
		this.y = y;
		this.Kingdom = kingdom;
		hp = maxhp = 300;
		rep = 'K';
	}
	
	public Boolean takeDamage(int d) {
        this.hp -= d;
        if(this.hp <= 0) {
            return true; // Estrutura foi destruida
        } else {
            return false; // Estrutura não foi destruida
        }
    }
}
