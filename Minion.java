package RPG2;
public class Minion {
    double vida;
    int dano;
    public Minion(double vida,int dano){
        this.vida=vida;
        this.dano=dano;
    }
    public void getMinionStatus(){
        System.out.println(
            "Esse minion tem "+
            this.vida+
            " de vida e "+
            this.dano+
            " de dano"
            );
    }
}
