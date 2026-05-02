package ads.poo;

import java.util.ArrayList;

public class Motorista {
    private String nome;
    private ArrayList<Veiculo> veiculos;

    public Motorista(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    public boolean addVeiculo(Veiculo veiculo) {
        if (!veiculos.contains(veiculo)) {
            veiculos.add(veiculo);
            return true;
        } else return false;
    }

    public boolean removeVeiculo(Veiculo veiculo) {
        if (veiculos.contains(veiculo)) {
            veiculos.remove(veiculo);
            return true;
        } else return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(nome).append("\n");
        for (Veiculo veiculo : veiculos) {
            builder.append(veiculo).append("\n");
        }
        return builder.toString();
    }
}
