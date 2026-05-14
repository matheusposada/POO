package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Telefone GrahamBell = new Telefone(48,"121", "teste", 5.5,new Dimensao(20,20,20));
        SemFio Jobs = new SemFio(43,"333","iphone",0.3,new Dimensao(10,15,2),54,2,1000.9);

        IO.println(GrahamBell);
        IO.println(Jobs);



    }
}
