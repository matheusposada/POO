package ads.poo;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoEmail emails;
    private ColecaoTelefone telefones;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String rotulo, String valor){
        return telefones.add(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo, String valor){
        return telefones.remove(rotulo, valor);
    }

    public boolean removeEmail(String rotulo, String valor){
        return emails.remove(rotulo, valor);
    }

    public boolean updateTelefone(String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    @Override
    public String toString() {
        return "{" +
                "nome: '" + nome + '\'' +
                ", sobrenome: '" + sobrenome + '\'' +
                ", data de Nascimento: " + dataNasc +
                ", emails: " + emails +
                ", telefones: " + telefones +
                '}';
    }
}
