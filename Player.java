package RPG2;
import java.util.Scanner;
public class Player {
    Scanner entrada = new Scanner(System.in);
    public String nome;
    public double vida=100;
    public double mana=100;
    public int D6(){
        int random = (int)(Math.random() * (6 - 1 + 1) + 1);
        System.out.println("O resultado do dado é: "+random);
        return random;
    }
    public int D10(){
        int random = (int)(Math.random() * (10 - 1 + 1) + 1);
        System.out.println("O resultado do dado é: "+random);
        return random;
    }
    public int D20(){
        int random = (int)(Math.random() * (20 - 1 + 1) + 1);
        System.out.println("O resultado do dado é: "+random);
        return random;
    }
    public void getStatus(){
        System.out.println(
            nome+
            " Tem atualmente "+
            vida+
            " de vida "+
            "e mana "+
            mana
        );
    }
    public int setEscolha(int quantidadeDeEscolha,String preludio,String escolha1,String escolha2,String escolha3,String escolha4){
        System.out.println(preludio);
        if(quantidadeDeEscolha==1){System.out.println(escolha1);}
        else if(quantidadeDeEscolha==2){
            System.out.printf(escolha1+"\n");
            System.out.printf(escolha2+"\n");
        }else if(quantidadeDeEscolha==3){
            System.out.printf(escolha1+"\n");
            System.out.printf(escolha2+"\n");
            System.out.printf(escolha3+"\n");
        }else{
            System.out.printf(escolha1+"\n");
            System.out.printf(escolha2+"\n");
            System.out.printf(escolha3+"\n");
            System.out.printf(escolha4+"\n");
        }
        int escolha=entrada.nextInt();
        while(escolha<1 || escolha>quantidadeDeEscolha){
            System.out.println("Escolha invalida tente novamente");
            escolha=entrada.nextInt();
        }
        return escolha;
    }
    
}