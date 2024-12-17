package Structures;

// A classe do recruta se refere a uma unidade na fila de treinamento do quartel.
// Quando seu treinamento for concluido, ela ira ser removida e o reino ganhará
// uma unidade da classe especificada na variavel "type".
public class Recruit {
    private int type; // 1: Arqueiro. 2: Cavalaria. 3: Lançeiro. 4: Paladino.
    private int recruitTime;
    private int recruitProgress;

    public Recruit(int type, int recruitTime) {
        this.type = type;
        this.recruitTime = recruitTime;
        this.recruitProgress = 0;
    }

    public int recruit() {
        this.recruitProgress += 1;
        if(this.recruitProgress >= this.recruitTime) { // Avisa ao quartel que o recrutamento está completo
        	this.recruitProgress = recruitTime;
            return this.type;
        } else { // Avisa ao quartel que o recrutamento está incompleto
            return 0;
        }
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRecruitTime() {
        return this.recruitTime;
    }

    public void setRecruitTime(int recruitTime) {
        this.recruitTime = recruitTime;
    }

    public int getRecruitProgress() {
        return this.recruitProgress;
    }

    public void setRecruitProgress(int recruitProgress) {
        this.recruitProgress = recruitProgress;
    }
    
}
