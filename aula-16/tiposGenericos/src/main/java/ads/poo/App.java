package ads.poo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main(String[] args) {

//        Caixa<String> c = new Caixa<>("Olá mundo");
//        Caixa<Pessoa> d = new Caixa<>(new Pessoa("João"));
//
//        String s = c.getConteudo();
//        Pessoa p = d.getConteudo();
//
//        IO.println(s);
//        IO.println(p);
//
//        ArrayList<Pessoa> a = new ArrayList<>();
//
//        HashMap<String, String> b;


        Scanner ler = new Scanner(System.in);
        int a, b;

        try{
            System.out.println("Entre com o número: ");
            a = ler.nextInt();
            System.out.println("Entre com o número: ");
            b = ler.nextInt();

            int res = a / b;

            System.out.println(a + "dividido por " + b + " = " + res);

        } catch(InputMismatchException e){
            System.err.println("Só é permitido números inteiros");
            ler.nextLine(); // limpa o buffer do teclado
        } catch(ArithmeticException e){
            System.err.println("Não é permitido dividir por zero");
            ler.nextLine(); // limpa o buffer do teclado
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado");
            ler.nextLine();
        }
            System.out.println("Fim do programa");


    }
}
