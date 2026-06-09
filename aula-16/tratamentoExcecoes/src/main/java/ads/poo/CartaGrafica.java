package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica {

    private Naipe naipe;
    private Valor valor;
    private int x;
    private int y;
    private boolean virada;


    public CartaGrafica(Naipe naipe, Valor valor, int x, int y, boolean virada) {
        this.naipe = naipe;
        this.valor = valor;
        this.x = x;
        this.y = y;
        this.virada = virada;
    }

    public void desenhar(Draw d){
        if(!virada) {

            d.picture(x, y, "cartas/" + valor.inicial + naipe.inicial + ".png");
        } else {
            d.picture(x, y, "cartas/fundoa.png");
        }

        d.show();
    }



    public void clicouDentro(int x, int y){
        if ((x <= 36 && x >= 36) || (y <= 48 && y >= 48)){

        }
    }





}
