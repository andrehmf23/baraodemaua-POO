package Structures;

public abstract class Collectable extends Structure {
    public int resource;
    
    public int takeDamage(int d) {
        this.hp -= d;
        if(this.hp <= 0) {
            return 0;
        } else {
            return resource; // O valor do recurso coletado.
        }
    }
}
