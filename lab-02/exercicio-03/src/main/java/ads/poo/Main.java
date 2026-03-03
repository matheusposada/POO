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
        } else if (args[0].equals("losango")) {
            for (int i = 0; i < col; i++){
                IO.println(art);
                art = art + "*";
            }
        }


    }



}


