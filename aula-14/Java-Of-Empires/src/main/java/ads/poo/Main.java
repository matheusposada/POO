package ads.poo;


public class Main {
    static void main(String[] args) {

        Personagem[] personagens = new Personagem[3];
        personagens[0] = new Aldeao();
        personagens[1] = new Arqueiro();
        personagens[2] = new Cavaleiro();

        for (Personagem p : personagens){
            IO.println(p);
            IO.println(p.mover());
            if(p instanceof Guerreiro g) {
                IO.println(g.atacar());
            }
        }











    }
}
