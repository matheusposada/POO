package ads.poo;


import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Aldeao());
        personagens.add(new Arqueiro());
        personagens.add(new Cavaleiro());

        for (Personagem p : personagens){
            IO.println(p.mover()); //polimorfismo
        }

    }
}
