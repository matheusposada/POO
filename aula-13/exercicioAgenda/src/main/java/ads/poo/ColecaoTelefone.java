package ads.poo;
import java.text.ParseException;
import java.util.HashMap;
import javax.swing.text.MaskFormatter;

public class ColecaoTelefone {
    private HashMap<String, String> dados = new HashMap<>();

    public boolean add (String rotulo, String valor) {
        if (!dados.containsKey(rotulo)){
            dados.put(rotulo, valor);
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
            dados.put(rotulo, valor);
            return true;
        } else return false;
    }


    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("E-mail: "+"\n");
        this.dados.forEach((rotulo, valor)->{
            sb.append(rotulo).append(": ").append(formata("(##) #####-####", valor)).append('\n');
        });
        return sb.toString();
    }
}
