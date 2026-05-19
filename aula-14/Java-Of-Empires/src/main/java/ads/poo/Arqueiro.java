package ads.poo;

public class Arqueiro extends Personagem implements Guerreiro{

    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String mover(){
        return super.mover() + "Arqueiro";
    }

    @Override
    public String atacar(){
        return "Arqueiro atacando\n";
    }

    @Override
    public String toString() {

        return "ARQUEIRO" + super.toString();
    }
}
