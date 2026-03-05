package ads.poo;

public class Main {
    static void main(String[] args) {

        Lampada a = new Lampada();

        a.LigarDesligar();

        if (a.isLigada()){
            System.out.println("Está ligada");
        } else{
            System.out.println("Está desligado");
        }


        Lampada b = new Lampada();

        System.out.println(a.isLigada());
        System.out.println(b.isLigada());



    }
}
