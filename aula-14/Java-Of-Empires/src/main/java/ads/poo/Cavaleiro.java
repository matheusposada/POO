package ads.poo;

public class Cavaleiro extends Personagem implements Guerreiro{
    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String mover(){
        return super.mover() + "Cavaleiro";
    }

    @Override
    public String atacar(){
        return "Cavaleiro atacando\n";
    }

    @Override
    public String toString() {

        return "CAVALEIRO" + super.toString();
    }
}
