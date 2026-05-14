
## Sistema acadêmico
```mermaid

classDiagram
    
    class Pessoa{
        -nome: String
        -endereco: String
        -dataNasc: LocalDate
    }
    class Aluno{
        -matricula: int       
        
    }
    class Professor{
        -disciplina: String
        
    }
    class Coordenador{
        -curso: String
    }
    class Diretor{
        
    }
    class Funcionario{
        -salario: double
    }
    
    Aluno --|> Pessoa
    Funcionario --|> Pessoa
    Coordenador --|> Professor
    Diretor --|> Funcionario
    Professor --|> Funcionario
    



```


## Sistema de livraria

````mermaid

classDiagram

    class Obra{
        -id: String
        -paginas: int
        -edicao: String
        -titulo: String
    }
    class Livro{
        -ISBN: int
        -autor: String
    }
    class Revista{
        -ISSN: int
    }
    class Jornal{
        
    }
    class Gibi{
        -ilustradores: String
    }
    
    class Periodicos{
        
    }
    
    Periodicos --|> Obra
    Gibi --|> Revista
    Livro --|> Obra
    Revista --|> Periodicos
    Jornal --|> Periodicos

````