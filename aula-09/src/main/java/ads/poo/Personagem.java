package ads.poo;

public class Personagem {

    private String nome;
    private String poder;
    private int forca;
    private String genero;
    private int cura;
    private int vidaAtual;
    private int velocidade;

    public void setVelocidade(int vel) {
        velocidade = vel;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setPoder(String p) {
       poder = p;
    }

    public void setForca(int f) {
        forca = f;
    }

    public void setGenero(String g) {
        genero = g;
    }
    public void setVidaAtual(int v) {
        vidaAtual = v;
    }

    public void setCura(int c){
        cura = c;
    }

    public int getForca() {
        return forca;
    }
    public String getNome(){
        return nome;
    }
    public int getCura() {
        return cura;
    }

    public String getGenero() {
        return genero;
    }

    public String getPoder() {
        return poder;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
