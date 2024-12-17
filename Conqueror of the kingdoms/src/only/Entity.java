package only;

public class Entity extends Existence{
	protected int value;//Value valor da Entidade
	protected int speed;//Velocidade da Entidade
	protected int damage;//Dano
	protected int range;//Distância
	protected int delay;
	protected int Atkspeed;
	
	public Entity() {
		speed = 1;
		damage = 1;
		value = 1;
		range = 1;
	}
	//Value valor da tropa
	
	public void move(int x, int y) {//movimentação em relação a distância
		if (this.x<x-range) this.x += speed;
		else if (this.x>x+range) this.x -= speed;
		
		if (this.y<y-range) this.y += speed;
		else if (this.y>y+range) this.y -= speed;
	}
	//isso define o quando a peça vai se mexer em direção ao local x
	
	public void attack(Existence target) {//define o dano sofrido pelas entidades opostas a vc, se chegar a 0, entidade deletada
		move(target.x,target.y);
		if((this.x >= target.x-range && this.x <= target.x+range) && (this.y >= target.y-range && this.y <= target.y+range))
		{
			target.hp -= damage;
		}
	}
	public void Update(Existence target){
		this.delay++;
		if(this.delay>=this.Atkspeed){
			attack(target);
			delay=0;
		}
	}


	
	// Entity
	// X (hp,damage,speed,range,value)
	// V (20,3,1,1,1)
	// L (40,10,1,1,1)
	// A (25,5,1,4,1)
	// C (35,5,2,1,2)
	// P (60,5,1,1,1)
}
