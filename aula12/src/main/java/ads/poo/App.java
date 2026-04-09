package ads.poo;


import java.util.HashMap;

public class App {
    private HashMap <String, Livro> livro = new HashMap<>();
    void menu(int opcao){
        switch (opcao){
            case 1 -> {cadastrarLivro();}
            case 2 -> {listarLivros();}
            case 3 -> {listarLivrosdoAno();}
            case 4 -> {alterarDados();}
        }
    }

    static void main(String[] args) {
        App app = new App();
        int opcao = 0;

        do {
            IO.println("""
                   ..:: MENU::..");
                   "1 - Cadastrar livro.");
                   "2 - Listar todos os livros.");
                   "3 - Listar todos os livros publicados no ano.");
                   "4 - Alterar dados de um livro.");
                   "5 - Sair.""");

            opcao = Integer.parseInt(IO.readln("Entre com uma opção"));
            app.menu(opcao);
        }while (opcao != 5);
    }


    void cadastrarLivro(){
        var isbn = IO.readln("Código ISBN");
        var autor = IO.readln("autor: ");
        var titulo = IO.readln("Titulo: ");
        var ano = Integer.parseInt(IO.readln("ano: "));

        Livro novoLivro = new Livro(isbn, autor, titulo, ano);

        if (!livro.containsKey(isbn)){

            livro.put(isbn, new Livro(isbn, autor, titulo, ano));

        }

    }

    void listarLivros(){

        livro.forEach((isbn, livro)->{
            IO.println(livro);
        });

    }

    void listarLivrosdoAno(){

        livro.forEach((ano, livro)->{
            IO.println(livro);
        });

    }

    void alterarDados(){



    }


}

