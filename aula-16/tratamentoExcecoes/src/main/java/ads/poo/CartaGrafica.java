package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta implements Gui {

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

    @Override
    public void desenhar(Draw d){
        if(!virada) {

            d.picture(x, y, "cartas/" + valor.inicial + naipe.inicial + ".png");
        } else {
            d.picture(x, y, "cartas/fundoa.png");
        }


    }

    @Override
    public boolean clicouDentro(double x, double y){
        if ((x <= this.x + 36 && x >= this.x - 36) && (y <= this.y + 48 && y >= this.y - 48)){
            virada =!virada;
            return true;
        }
            return false;
    }





}
