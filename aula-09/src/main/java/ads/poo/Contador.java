package ads.poo;

public class Contador {

    private int valorAtual;

    public void setValorAtual(int a){
            valorAtual = a;
    }
    public void contador(){
        valorAtual = valorAtual + 1;
    }
    public int valorAtual(){
        return valorAtual;
    }

};
