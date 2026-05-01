package ads.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Endereco> enderecos = new ArrayList<>();
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public boolean addEndereco(Endereco endereco) {
        if (!enderecos.contains(endereco)) {
            enderecos.add(endereco);
            return true;
        } else return false;
    }

    public boolean removeEndereco(Endereco endereco) {
        if (this.enderecos.contains(endereco)) {
            this.enderecos.remove(endereco);
            return true;
        } else return false;
    }

    public boolean addPedido(Pedido pedido) {
        if (!pedidos.contains(pedido)) {
            pedidos.add(pedido);
            return true;
        } else return false;
    }

    public boolean removePedido(Pedido pedido) {
        if (this.pedidos.contains(pedido)) {
            this.pedidos.remove(pedido);
            return true;
        }  else return false;
    }


    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome: ").append(nome).append("\n");
        sb.append("E-mail: ").append(email).append("\n");

        sb.append("Enderecos:\n");
        for (Endereco e : enderecos) {
            sb.append(e);
        }

        sb.append("Pedidos:\n");
        for (Pedido p : pedidos) {
            sb.append(p);
        }

        return sb.toString();
    }
}
