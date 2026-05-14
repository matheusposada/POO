package ads.poo.produtos;

public class Dimensao {
    private int altura;
    private int largura;
    private int profundidade;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    public Dimensao(int altura, int largura, int profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("\n").append("altura: ").append(altura).append("\n");
        sb.append("largura: ").append(largura).append("\n");
        sb.append("profundidade: ").append(profundidade).append("\n");
        return sb.toString();
    }
}
