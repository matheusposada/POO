# Diagrama de classes UML

```mermaid
classDiagram
    direction LR
    
    
    class Produto {
        -descricao: String
        -id: String
        -quantidade: int
        -preco: double
        +Produto(String descricao, String id, double preco)
                
    }
    
    class Cliente {
        -pedido ArrayList ~Pedido~
        -nome: String
        -email: String
        -endereco ArrayList ~Endereco~
        +Cliente(String nome, String email)
        +addEndereco(String rua, int numero, String bairro, String cidade, String cep)
        +pedir(int quantidade, Produto item)
    }
    class Endereco {
        -rua: String
        -numero: int
        -complemente: String
        -cidade: String
        -cep: String
        +Endereco(String rua, int numero, String complemento, String cidade, String cep)
    }
           
    class Pedido {
        -produto ArrayList ~Produto~
        -data: LocalDate
        -situacao: String
        +Pedido(data: LocalDate)
        +addProduto(item: Produto, quantidade: int): boolean
        +removeProduto(item:Produto, quantidade: int): boolean
    }
        Cliente "1" *-- "0..*" Endereco
        Cliente "1" *-- "0..*" Pedido
        Pedido "1..*" o-- "0..*" Produto  
        
       
       
 ```