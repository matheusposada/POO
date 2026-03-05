package ads.poo;

public class Lampada {

    // atributos
    private boolean ligada;


    // metodos
    boolean isLigada (){
        return ligada;
    }

    boolean LigarDesligar (){
        ligada = !ligada;
        return ligada;
    }

}

