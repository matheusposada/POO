package ads.poo;

import java.time.LocalDate;

public class Viagem {
    private LocalDate data;
    private Motorista motorista;
    private Veiculo veiculo;
    private double distancia;

    public Viagem(LocalDate data, Motorista motorista, Veiculo veiculo, double distancia) {
        this.data = data;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.distancia = distancia;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(data.toString());
        sb.append("\nMotorista: ").append(motorista);
        sb.append("\nVeiculo: ").append(veiculo);
        sb.append("\nDistancia: ").append(distancia);

        return sb.toString();
    }
}
