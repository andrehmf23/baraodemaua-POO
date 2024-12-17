package Structures;
import java.util.ArrayList;

public class Barracks extends Building {
    private ArrayList<Recruit> queue;
    
    public Barracks(int Kingdom, int x, int y) {
    	this.x = x;
		this.y = y;
    	this.Kingdom = Kingdom;
        this.rep = 'D';
        this.hp = 10;
        this.queue = new ArrayList<Recruit>();
    }

    public void AddUnit(int type) {
        // Tempo de recrutamento provavelmente vai variar dependendo da unidade. Posso fazer um
        // switch case aqui para definir isso dependendo do tipo.
        queue.add(new Recruit(type, 5));
    }

    public int Update() { // Faz a mesma coisa que o antigo <------------
        if(ConstruidoOuConstruir() && queue.size() > 0) {
            int s = queue.get(0).recruit();
            if(s != 0) { // Soldado terminou de recrutar
                queue.remove(0);
                return s;
            } 
        }
        return 0;// Indica que o prédio está em construção
    }

}
