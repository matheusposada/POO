package ads.poo;


public class Main {
    static void main(String[] args) {
    /*
        Contador odometro = new Contador();

        odometro.setValorAtual(99999);

        odometro.contador();
        System.out.println(odometro.valorAtual());
        odometro.contador();
        System.out.println(odometro.valorAtual());
    */


        Personagem guerreiro = new Personagem();

        guerreiro.setGenero("masculino");
        guerreiro.setForca(1);
        guerreiro.setNome("Neymartogrosso");
        guerreiro.setPoder("auto cura");
        guerreiro.setVidaAtual(10);
        guerreiro.setCura(-100);
        guerreiro.setVelocidade(100);

        System.out.println();
        System.out.println("Líder Guerreiro " + guerreiro.getNome() + ":");
        System.out.println();
        System.out.println("Gênero: " + guerreiro.getGenero());
        System.out.println("Força: " + guerreiro.getForca());
        System.out.println("Poder: " + guerreiro.getPoder());
        System.out.println("Vida inicial: " + guerreiro.getVidaAtual());
        System.out.println("Grau de cura: " + guerreiro.getCura());
        System.out.println("Velocidade: " + guerreiro.getVelocidade());


        Personagem mago = new Personagem();

        mago.setGenero("feminino");
        mago.setForca(100);
        mago.setNome("Bruna Marquezine");
        mago.setPoder("beleza fatal");
        mago.setVidaAtual(100);
        mago.setCura(1);
        mago.setVelocidade(10);

        System.out.println();
        System.out.println("Maga raínha " + mago.getNome() + ":");
        System.out.println();
        System.out.println("Gênero: " + mago.getGenero());
        System.out.println("Força: " + mago.getForca());
        System.out.println("Poder: " + mago.getPoder());
        System.out.println("Vida inicial: " + mago.getVidaAtual());
        System.out.println("Grau de cura: " + mago.getCura());
        System.out.println("Velocidade: " + mago.getVelocidade());
    }
}

