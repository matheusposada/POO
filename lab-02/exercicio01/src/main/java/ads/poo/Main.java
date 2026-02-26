package ads.poo;


import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        IO.println("Entre com o dia: ");
        int dia = scanner.nextInt();
        scanner.nextLine();
        IO.println("Entre com o mês: ");
        String mes = scanner.nextLine();



        if ((dia >= 20 && mes.equalsIgnoreCase("março")) || mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("maio") || (dia <= 20 && mes.equalsIgnoreCase("junho"))) {
            IO.println("# Saída: ");
            IO.println("Outono!");
        } else if ((dia >= 21 && mes.equalsIgnoreCase("junho")) || mes.equalsIgnoreCase("julho") || mes.equalsIgnoreCase("agosto") || (dia <= 20 && mes.equalsIgnoreCase("setembro"))) {
            IO.println("# Saída: ");
            IO.println("Inverno!");
        } else if ((dia >= 21 && mes.equalsIgnoreCase("setembro")) || mes.equalsIgnoreCase("outubro") || mes.equalsIgnoreCase("novembro") || (dia <= 20 && mes.equalsIgnoreCase("dezembro"))) {
            IO.println("# Saída: ");
            IO.println("Primavera!");
        }else if ((dia >= 21 && mes.equalsIgnoreCase("dezembro")) || mes.equalsIgnoreCase("janeiro") || mes.equalsIgnoreCase("fevereiro") || (dia <= 20 && mes.equalsIgnoreCase("março"))) {
            IO.println("# Saída: ");
            IO.println("Verão!");
        }
        scanner.close();

    }
}

