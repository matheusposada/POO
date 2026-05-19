package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

import java.awt.image.ImagingOpException;

public class Main {
    static void main(String[] args) {

        Telefone t = new Telefone(48,"121", "teste", 5.5,new Dimensao(20,20,20));
        SemFio sf = new SemFio(43,"333","iphone",0.3,new Dimensao(10,15,2),54,2,1000.9);
        Telefone a = new SemFio(44,"3323","ipone",0.3,new Dimensao(1,25,3),44,3,1000.8);

       // SemFio outra = (SemFio) a; //coerção de tipo em 2 passos. Variável auxiliar

//        Telefone t = new Telefone();
//        SemFio sf = new SemFio();
//        Telefone a = new SemFio();

        Telefone[] vetor = new Telefone[3];

        vetor[0] = t ;
        vetor[1] = sf ;
        vetor[2] = a ;

        for (Telefone aux : vetor){
            IO.println(aux.getModelo());
            if (aux instanceof SemFio novo){
                IO.println(novo.getFrequencia());
            }
        }


    }
}
