package ads.poo;

public class Main {
    static void main(String[] args) {

        /* Lampada a = new Lampada();

        a.LigarDesligar();

        if (a.isLigada()){
            System.out.println("Está ligada");
        } else{
            System.out.println("Está desligado");
        }


        Lampada b = new Lampada();

        System.out.println(a.isLigada());
        System.out.println(b.isLigada());

         */

        Caneta bic = new Caneta();

        bic.setCor("Azul");
        bic.setNivelTinta(0.01);

        String cor = bic.getCor();

        bic.abrirTampa();
        System.out.println(bic.isAberta());
        System.out.println(bic.getNivelTinta());
        System.out.println(bic.desenhar(1, 1, 1, 2));
        System.out.println(bic.getNivelTinta());
        bic.fecharTampa();





    }
}
