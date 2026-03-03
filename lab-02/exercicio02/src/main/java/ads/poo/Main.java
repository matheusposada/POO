package ads.poo;


import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n = random.nextInt(100) + 1;
        int contador = 0;
        int i;
        IO.println(n);

        do {
            IO.println("Chute um numero de 1 a 100:");
            i = scanner.nextInt();
            contador++;
            String tentativa = (n > i)? "O numero é maior que seu chute" : "O numero é menor que seu chute";
            IO.println(tentativa);
        } while (i != n);

            IO.println("Parabens, voce acertou em " + contador + " tentativas!");

    }
}
