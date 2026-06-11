package ads.poo;

import java.util.Random;

public class Dado {

    protected int face;
    protected int[] est;
    Random r = new Random();

    public Dado(int face) {
        this.face = face;
    }

    public int jogar(){
        this.face =r.nextInt(6);
        this.est[this.face]++;
        return (this.face+1);
    }

}
