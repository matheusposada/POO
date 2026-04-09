package ads.poo;

public class Livro {

    private final String ISBN;
    private String autor;
    private String titulo;
    private int ano;

    public Livro(String ISBN, String autor, String titulo, int ano) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("""
                ISBN: %s
                autor: %s
                titulo: %s
                ano: %d
                
                """, ISBN, autor, titulo, ano);
    }
}




