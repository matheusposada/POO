package ads.poo;

public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(String rua, String numero, String complemento, String cidade, String uf, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {}

    @Override
    public String toString() {
        return String.format("""
                \n%s, %s, %s. %s - %s
                Cep: %s\n
                """, rua, numero, complemento, cidade, uf, cep);
    }
}
