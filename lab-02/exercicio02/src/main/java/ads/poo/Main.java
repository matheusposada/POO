package ads.poo;


import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n = random.nextInt(100);
        int contador = 1;
        IO.println("Chute um numero de 1 a 100:");
        int i = scanner.nextInt();


        while (i != n) {
            contador++;
            if (i < n) {
                IO.println("O numero é maior que " + i + ", tente novamente:");
            } else {
                IO.println("O numero é menor que " + i + ", tente novamente:");
            }
            i = scanner.nextInt();
        }

        IO.println("Parabens, voce acertou em " + contador + " tentativas!");

    }
}
