package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> itens;
    private LocalDate data;
    private String situacao;

    public Pedido(LocalDate data) {
        this.itens = new ArrayList<>();
        this.data = data;
        this.situacao = "pendente";
    }

    public boolean addProduto(Produto itens, int quantidade) {
        if (quantidade > itens.getQuantidade()) {
            return false;
        } else  {
            this.itens.add(itens);
        }
        return true;
    }

    public boolean removeProduto(Produto itens, int quantidade) {
        if (quantidade > itens.getQuantidade()) {
            return false;
        } else   {
            this.itens.remove(itens);
        }
        return true;
    }

    public ArrayList<Produto> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Produto> itens) {
        this.itens = itens;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Data: ").append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append("\n");
        sb.append("Situacao: ").append(situacao).append("\n");

        sb.append("Itens:\n");
        for (Produto p : itens) {
            sb.append(p);
        }

        return sb.toString();
    }
}
