package ads.poo.produtos;

public class Telefone {
    protected int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private Dimensao dimensao;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    public Telefone() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("\n").append("codigo: ").append(codigo);
        sb.append("numSerie: ").append(numSerie).append("\n");
        sb.append("modelo: ").append(modelo).append("\n");
        sb.append("peso: ").append(peso).append("\n");
        sb.append("dimensao: ").append(dimensao).append("\n");

        return sb.toString();
    }
}

