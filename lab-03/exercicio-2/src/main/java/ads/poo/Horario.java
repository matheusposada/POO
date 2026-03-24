package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        if ((hora >= 0 && hora <= 23) && (minuto >= 0 && minuto <= 59) && (segundo >= 0 && segundo <= 59) ) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;

        } else {
            this.hora = 0;
            this.minuto= 0;
            this.segundo= 0;
        }
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            return true;
        } else {
            return false;
        }

    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public long horaParaSegundos(){
        return (hora * 3600L) + (minuto * 60L) + segundo;
    }

    public long diferenca(Horario d){
        return d.horaParaSegundos() - this.horaParaSegundos();
    }

    private String converterParaExtenso(int valor){
        return switch (valor){
          case 0 -> "zero";
          case 1 -> "um";
          case 2 -> "dois";
          case 3 -> "três";
          case 4 -> "quatro";
          case 5 -> "cinco";
          case 6 -> "seis";
          case 7 -> "sete";
          case 8 -> "oito";
          case 9 -> "nove";
          case 10 -> "dez";
          case 11 -> "onze";
          case 12 -> "doze";
          case 13 -> "treze";
          case 14 -> "catorze";
          case 15 -> "quinze";
          case 16 -> "dezesseis";
          case 17 -> "dezessete";
          case 18 -> "dezoito";
          case 19 -> "dezenove";
          case 20 -> "vinte";
          case 30 -> "trinta";
          case 40 -> "quarenta";
          case 50 -> "cinquenta";
          default -> "";

        };
    }

    public String porExtenso(){

        int unidadeHora = this.hora % 10;
        int dezenaHora = (this.hora /10) * 10;
        int unidadeMinuto = this.minuto % 10;
        int dezenaMinuto = (this.minuto /10) * 10;
        int unidadeSegundo = this.segundo % 10;
        int dezenaSegundo = (this.segundo/10) * 10;


        String hEx = converterParaExtenso(this.hora);
        String mEx = converterParaExtenso(this.minuto);
        String sEx = converterParaExtenso(this.segundo);

        return hEx + " " + mEx + " " + sEx;



    }


}
