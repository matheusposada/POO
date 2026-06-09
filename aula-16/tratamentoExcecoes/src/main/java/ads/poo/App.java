package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.Random;

public class App implements DrawListener {
    private Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);






        carta.desenhar(this.draw);
    }

    CartaGrafica carta = new CartaGrafica(Naipe.COPAS, Valor.DAMA, 100, 100, true);

    @Override
    public void mouseClicked(double x, double y) {

        if






        //        DrawListener.super.mouseClicked(x, y);
//
//        String valores = "123456789qkk";
//        String naipes = "oecp";
//        Random r = new Random();
//
//        String carta = String.format("cartas/%c%c.png",
//                valores.charAt(r.nextInt(13)),
//                naipes.charAt(r.nextInt(4)));
//
//
//
//
//        this.draw.picture(x, y, "cartas/1p.png");
//        this.draw.show();



    }

    static void main(String[] args) {
        App app = new App();
    }


}
