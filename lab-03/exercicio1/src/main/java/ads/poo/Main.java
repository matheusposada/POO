package ads.poo;


public class Main {
    static void main() {

        Ponto a = new Ponto(1, 2);
        Ponto b = new Ponto(3, 4);

        double distancia = a.distancia(b);

        IO.println(distancia);

    }
}
