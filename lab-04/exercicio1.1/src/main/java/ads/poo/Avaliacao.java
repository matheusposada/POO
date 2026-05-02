package ads.poo;

public class Avaliacao {
    private String comentario;
    private int nota;
    private Usuario usuario;
    private Filme filme;

    public Avaliacao(Filme filme, Usuario usuario, String comentario, int nota)
    {
        this.usuario = usuario;
        this.filme = filme;
        this.comentario = comentario;
        if (nota >= 1 && nota <= 5)
            this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >= 1 && nota <= 5)
            this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("%s, nota: %d", comentario, nota);
    }
}
