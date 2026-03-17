package ads.poo;

public class Carro {

    private String modelo; // " "
    private int velMax; // 0
    private int velAtual; // 0

    private static final int VEL_MAX_MODELOS = 300;
    private static final int VEL_MINIMA = 0;

    public Carro(String modelo, int velMax) {
        this.modelo = modelo;
        this.velMax = velMax;

    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velMax = VEL_MAX_MODELOS;
    }


    public void acelerar(int a) {
        velAtual = (velAtual + a < velMax) ? velAtual + a: velMax;
    }

    public void frear(int f) {
        if (velAtual - f >= VEL_MINIMA) {
            velAtual -= f;
        } else {
            velAtual = VEL_MINIMA;
        }
    }

    public int getVelAtual() {
        return velAtual;
    }

    public int getVelMax() {
        return velMax;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}


