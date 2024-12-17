package Structures;

public abstract class Building extends Structure {
    private static int buildCost, buildTime;
    protected int buildProgress, status;
    
    public Boolean takeDamage(int d) {
        this.hp -= d;
        if(this.hp <= 0) {
            return true; // Estrutura foi destruida
        } else {
            return false; // Estrutura não foi destruida
        }
    }

    public Boolean ConstruidoOuConstruir() {
        if (status == 0) { // Prédio está sendo construido
            Construir();
            return false;
        } else {
            return true;
        }
    }

    public void Construir() {
        buildProgress ++;
        if(buildProgress >= buildTime) {
            status = 1;
        }
    }


    public int getBuildProgress() {
        return this.buildProgress;
    }

    public void setBuildProgress(int buildProgress) {
        this.buildProgress = buildProgress;
    }

    public static int GetBuildCost() {
        return buildCost;
    }

}
