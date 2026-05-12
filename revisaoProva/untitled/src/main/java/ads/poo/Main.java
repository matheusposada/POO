package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) throws InterruptedException {

        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);
        draw.enableDoubleBuffering();

       /*raw.circle(400,400,100);

        draw.setPenColor(Color.RED);

        draw.filledCircle(400,400,50);

        draw.line(300,300,500,500);


        double[] x = {100,150,250,300};
        double[] y = {100,150,150,100};

        draw.filledPolygon(x,y);


        draw.setPenColor(Color.LIGHT_GRAY);



        for (int i = 0; i < 800; i+=5) {
            draw.line(i, 0, i, 800);
            draw.line(0,1, 800, i);


        }

        draw.show();

        draw.setFontSize(30);




        for (int i = 0; i < 10; i++) {
           // draw.clear();
            draw.text(400,400,"" + i);
            draw.show();
            draw.clear();
            TimeUnit.SECONDS.sleep(1);
        }
    */ draw.setPenColor(Color.RED);
        draw.filledCircle(300,500,100);
        draw.filledCircle(480,500,100);

        double[] x = {300,450,150,300};
        double[] y = {100,250,250,100};

        draw.filledPolygon(x,y);

        draw.show();


    }
}








