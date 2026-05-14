package ads.poo.produtos;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();

        sb.append("\n").append("frequencia: ").append(frequencia).append("\n");
        sb.append("canais: ").append(canais).append("\n");
        sb.append("distanciaOperacao: ").append(distanciaOperacao).append("\n");


        return sb.toString()+super.toString();
    }
}
