package ads.poo;

public class Produto {

    private String descricao;
    private String id;
    private double preco;
    private int quantidade;

    public Produto(String descricao, String id, double preco) {
        this.descricao = descricao;
        this.id = id;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("""
                \nDescricao: %s
                Id: %s
                Preco: %.2f
                \nQuantidade: %d
                """, descricao, id, preco, quantidade);
    }
}
