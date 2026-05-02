package ads.poo;

public class Veiculo {
    private String modelo;
    private String placa;
    private String anoFab;

    public Veiculo(String modelo, String placa, String anoFab) {
        this.modelo = modelo;
        this.placa = placa;
        this.anoFab = anoFab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(String anoFab) {
        this.anoFab = anoFab;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(modelo).append(" - ").append(placa).append(" - ").append(anoFab);

        return builder.toString();
    }
}
