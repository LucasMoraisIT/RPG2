package RPG2;
public class Raca {
    public float dano;
    public int constituicao;
    public int sorte;
    public void getAtributos(){
        System.out.println(
            "Essa raça tem "+
            dano+
            " de dano "+
            "+ "+
            constituicao+
            " de constituição e "+
            sorte+
            " de sorte"
        );
    }
    public Raca(float dano,int constituicao,int sorte){
        this.dano=dano;
        this.constituicao=constituicao;
        this.sorte=sorte;
    }
}
