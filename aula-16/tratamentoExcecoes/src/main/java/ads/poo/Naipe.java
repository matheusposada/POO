package ads.poo;

public enum Naipe {

    PAUS(1, "paus", "p"),
    COPAS(2, "copas", "c"),
    ESPADAS(3, "espadas", "e"),
    OUROS(4, "ouros", "o");


    public final int valor;
    public final String extenso;
    public final String inicial;

    Naipe(int valor, String extenso, String incial) {
        this.valor = valor;
        this.extenso = extenso;
        this.inicial = incial;
    }
}
