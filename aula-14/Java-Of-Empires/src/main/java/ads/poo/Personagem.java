package ads.poo;

public abstract class Personagem {

    private int vida;
    private int ataque;
    private double Velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.Velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public String mover(){
        return "movendo ";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n");
        sb.append("vida: ").append(vida).append("\n");
        sb.append("ataque:").append(ataque).append("\n");
        sb.append("Velocidade: ").append(Velocidade).append("\n");
        return sb.toString();
    }
}
