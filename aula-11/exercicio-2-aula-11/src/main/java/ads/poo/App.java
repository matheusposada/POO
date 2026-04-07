package ads.poo;

import java.util.ArrayList;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas= new ArrayList<>();
    }

    void menu(int opcao){
        switch (opcao){
            case 1 -> {cadastrar();}
            case 2 -> {listarTodasContas();}
            case 3 -> {depositar();}
            case 4 -> {sacar();}
        }
    }

    static void main(String[] args) {
        App app = new App();
        int opcao = 0;

        do {
            IO.println("..:: MENU::..");
            IO.println("1 - Cadastrar conta.");
            IO.println("2 - Listar todas as contas.");
            IO.println("3 - Depositar em uma conta.");
            IO.println("4 - Sacar de uma conta.");
            IO.println("5 - Sair.");
            opcao = Integer.parseInt(IO.readln("Entre com uma opção"));
            app.menu(opcao);
        }while (opcao != 5);
    }

    void cadastrar(){
        var titular = IO.readln("Nome do titular: ");
        var numero = IO.readln("Numero da conta: ");
        var saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        Conta novaConta = new Conta(titular, numero, saldo);

        this.contas.add(novaConta);
    }

    void listarTodasContas(){

        /* for (int i = 0; i < contas.size(); i++) {
               IO.println(contas.get(i).toString());
           }
        */

        /* for each
        for (Conta elemento : contas ){
            IO.println(elemento.toString());
        }
        */

        /* for each lambda
        contas.forEach(elemento -> IO.println(elemento.toString()));
        */


        contas.forEach(IO::println);

    }

    void depositar(){
        var numero = IO.readln("Número da conta: ");
        var deposito = Double.parseDouble(IO.readln("Valor a ser depositado: "));
        for (Conta e : contas) {
            if (e.getNumero().equals(numero)){
                var saldoAnterior =e.getSaldo();
                e.depositar(deposito);
                if (saldoAnterior == e.getSaldo()){
                    IO.println("Não foi possível depositar. Somente valores positivos!");
                }
            }
        }
    }

    void sacar(){
        var numero = IO.readln("Número da conta: ");
        var saque = Double.parseDouble(IO.readln("Valor a ser sacado: "));
        for (Conta e : contas) {
            if (e.getNumero().equals(numero)){
                var saldoAnterior =e.getSaldo();
                e.sacar(saque);
                if (saldoAnterior == e.getSaldo()){
                    IO.println("Não foi possível sacar. Saldo insuficiente!");
                }
            }
        }
    }


}