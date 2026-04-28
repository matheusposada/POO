package ads.poo;
import java.util.HashMap;
import java.util.regex.Pattern;

public class ColecaoEmail {
    private HashMap<String, String> dados = new HashMap<>();
    private static String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";


    public boolean add (String rotulo, String valor) {
        if (!dados.containsKey(rotulo)){
            if(valor.matches(eR)){
                dados.put(rotulo, valor);}
            return true;
        } else return false;
    }

    public boolean remove (String rotulo, String valor) {
        if (dados.containsKey(rotulo)){
            dados.remove(rotulo, valor);
            return true;
        } else return false;
    }

    public boolean update (String rotulo, String valor) {
        if (dados.containsKey(rotulo)){
            if (valor.matches(eR))
                dados.put(rotulo, valor);
            return true;
        } else return false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("E-mail: "+"\n");
        this.dados.forEach((rotulo, valor)->{
            sb.append(rotulo).append(": ").append(valor).append('\n');
        });
        return sb.toString();
    }
}
