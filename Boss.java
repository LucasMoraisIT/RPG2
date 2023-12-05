package RPG2;
public class Boss {
    public double vida=250;
    public double dano=100;
    public void BossStatus(){
        System.out.println(
            "Esse boss tem "+
            this.vida+
            " de vida e "+
            this.dano+
            " de dano"
            );
    }
}
