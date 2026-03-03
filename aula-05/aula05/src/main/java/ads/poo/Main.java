package ads.poo;

import java.util.Random;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Random r = new Random(123456);

        int i = r.nextInt(10);

        System.out.println(i);
    }
}
