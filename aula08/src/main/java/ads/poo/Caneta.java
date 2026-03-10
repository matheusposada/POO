package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;

    public String desenhar(int x1, int y1, int x2, int y2){
        //calcular a distância
        //debitar do nivel de tinta
        //retornar a distancia percorrida
        //ex: desenhei 1cm na cor azul

        if (aberta) {
            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            if (nivelTinta >= ((distancia *0.01))){
                nivelTinta -= distancia * 0.01;
                return String.format("Desenhei %.2fcm na cor %s", distancia, cor);
            } else return String.format("Não há tinta suficiente!");
        } else return String.format("A caneta está fechada");
    }



    public boolean isAberta() {
        return aberta;
    }
    public String getCor(){
        return cor;
    }
    public double getNivelTinta() {
        return nivelTinta;
    }
    public void setCor(String c){
        cor = c;
    }
    public void setNivelTinta(double n){
        nivelTinta = n;
    }
    boolean abrirTampa(){
        aberta = true;
        return aberta;
    }
    boolean fecharTampa(){
        aberta = false;
        return aberta;
    }
}
