package ads.poo;

public class Main {
    static void main(String[] args) {

        int col = Integer.parseInt(args[1]);
        String art = "*";
        if (args[0].equals("triangulo")) {

            for (int i = 0; i < col; i++){
                IO.println(art);
                art = art + "*";
            }
        }  else if (figura.equalsIgnoreCase("losango")) {

            int n = Integer.parseInt(args[1]);

            for (int i = 1; i <= n; i++) {

                for (int esp = 1; esp <= n - i; esp++) {
                    System.out.print(" ");
                }

                for (int ast = 1; ast <= (2 * i - 1); ast++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = n - 1; i >= 1; i--) {

                for (int esp = 1; esp <= n - i; esp++) {
                    System.out.print(" ");
                }

                for (int ast = 1; ast <= (2 * i - 1); ast++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        }


    }



}


