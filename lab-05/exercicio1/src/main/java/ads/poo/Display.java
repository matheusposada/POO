package ads.poo;

import java.util.ArrayList;

public class Display {
    ArrayList<Segmento>segmentos = new ArrayList<>();

        public void adicionar(int numero){
            segmentos.add(new Segmento());
            segmentos.add(new Segmento());
            segmentos.add(new Segmento());
            segmentos.add(new Segmento());
            segmentos.add(new Segmento());
            segmentos.add(new Segmento());
            segmentos.add(new Segmento());


            switch (numero){
                case 1 -> {
                    segmentos.get(1).ligarDesligar();
                    segmentos.get(2).ligarDesligar();
                }

            }
        }




}
