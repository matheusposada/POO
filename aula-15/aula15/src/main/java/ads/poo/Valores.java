package ads.poo;

public enum Valores {

    AS(1, "ás"),
    DOIS(2, "dois"),
    TRES(3, "três"),
    QUATRO(4, "quatro"),
    CINCO(5, "cinco"),
    SEIS(6, "seis"),
    SETE(7, "sete"),
    OITO(8, "oito"),
    NOVE(9, "nove"),
    DEZ(10, "dez"),
    VALETE(11, "valete"),
    DAMA(12, "dama"),
    REI(13, "rei");

    public final int valor;
    public final String extenso;

    Valores(int valor, String extenso) {
        this.valor = valor;
        this.extenso = extenso;
    }
}
