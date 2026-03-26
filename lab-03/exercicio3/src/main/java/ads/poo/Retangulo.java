package ads.poo;

public class Retangulo {
    private int altura;
    private int largura;
    private String codificacao;

    public Retangulo(int altura, int largura, String codificacao) {
        this.altura = (altura <= 0) ? 3 : altura ;
        this.largura = (largura <= 0) ? 4 : largura;
        this.codificacao = (codificacao.equalsIgnoreCase("UTF8")) ? "UTF8" : "ASCII";
    }

    public Retangulo(){
        this.largura = 4;
        this.altura = 3;
        this.codificacao = "ASCII";
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }
    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
            return true;
        } else return false;

    }

    public String getCodificacao() {
        return codificacao;
    }

    public boolean setCodificacao(String codificacao) {
        if (codificacao.equalsIgnoreCase("ASCII") || codificacao.equalsIgnoreCase("UTF8")) {
            this.codificacao = codificacao;
            return true;
        } else return false;
    }
}
