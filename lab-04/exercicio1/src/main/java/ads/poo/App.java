package ads.poo;
import java.time.LocalDate;



public class App {
    public static void main(String[] args) {

        //Estoque:
        Produto a12 = new Produto("Camiseta Corinthians titular 2012", "a12", 250.00);
        a12.setQuantidade(5);
        Produto b13 = new Produto("Camiseta Corinthians reserva 2013", "b13", 230.00);
        b13.setQuantidade(7);
        Produto a15 = new Produto("Camiseta Corinthians titular 2015", "a15", 320.00);
        a15.setQuantidade(8);
        Produto a99 = new Produto("Camiseta Corinthians titular 1999", "a99", 450.00);
        a99.setQuantidade(3);
        Produto b77 = new Produto("Camiseta Corinthians reserva 1977", "b77", 210.00);
        b77.setQuantidade(10);

        //Carteira de Cliente:
        Cliente cliente = new Cliente("Matheus Posada", "matheusposada@gmail.com");
        Endereco endereco = new Endereco("Olegario Pereira", "362", "ap 02", "Florianopolis", "SC", "88056-435");

        cliente.addEndereco(endereco);

        //pedido
        Pedido pedido = new Pedido(LocalDate.now());
        pedido.setSituacao("Pagamento aprovado");
        cliente.addPedido(pedido);

        pedido.addProduto(a12, 1);
        pedido.addProduto(a99, 1);

        double valorTotal = (a12.getPreco() * a12.getQuantidade()) +  (a99.getPreco() * a99.getQuantidade());


        IO.println(cliente);
        IO.println("Valor final: " + valorTotal);






    }




}
