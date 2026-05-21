package ads.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletor {
    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return super.mover() + "Aldeão";
    }

    @Override
    public String atacar() {
        return "Aldeão atacando\n";
    }


    @Override
    public String coletarMadeira() {
        return "Coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Coletando ouro";
    }

    @Override
    public String toString() {

        return "ALDEÃO" + super.toString();
    }
}