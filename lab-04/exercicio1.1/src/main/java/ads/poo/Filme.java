package ads.poo;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private String ano;
    private String genero;
    private String diretor;
    private ArrayList<Ator>atores;

    public Filme(String titulo, String ano, String genero, String diretor) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.atores = new ArrayList<>();
    }

    public boolean addAtor(Ator a){
        if(!atores.contains(a)){
            atores.add(a);
            return true;
        } else return false;
    }
    public boolean removeAtor(Ator a){
        if(atores.contains(a)){
            atores.remove(a);
            return true;
        }  else return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Filme: ").append(titulo).append(", ").append(ano).append(".  ").append(genero).append(" , ").append(diretor);
        sb.append("Atores: ").append(atores.toString());

        return sb.toString() ;
    }
}
