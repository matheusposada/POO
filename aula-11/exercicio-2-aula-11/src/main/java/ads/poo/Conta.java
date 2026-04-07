package ads.poo;

public class Conta {

    private String titular;
    private String numero;
    private  double saldo;

    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor){
        this.saldo += (valor > 0) ? valor : 0;
        return saldo;
    }

    public void sacar(double valor){
        this.saldo -= (valor > saldo) ? 0 : (valor > 0) ? valor : 0;
    }

    @Override
    public String toString() {
        return String.format("""
                Conta: %s
                Titular: %s
                Saldo: %.2f
                """,numero, titular, saldo);

    }

    public String getTitular() {
        return titular;
    }
}
