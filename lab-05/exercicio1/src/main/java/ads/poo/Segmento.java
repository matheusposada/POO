package ads.poo;

import java.awt.*;

public class Segmento {

    private boolean ligada;


    public Segmento(double[] x, double [] y, Color cor) {
    }

    public boolean isLigada(){
        return ligada;
    }

    public boolean ligarDesligar(){
        ligada = !ligada;
        return ligada;
    }


}
