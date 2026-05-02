# Diagrama de Classe UML

## Sistema de gestão de frotas

````mermaid
classDiagram
    
    class Veiculo{
        -modelo: String
        -placa: String
        -anoFab: String
        +Veiculo(String modelo, String placa, String anoFab)
    }
    
    class Motorista {
        -nome: String
        -veiculo:ArrayList~Veiculo~
        +Motorista(String nome)
        +addVeiculo(String modelo, String placa, String anoFab): boolean
        -removeVeiculo(String modelo, String placa, String anoFab): boolean
    }
    
    class Viagem {
        -data:LocalDate
        -motorista: Motorista
        -veiculo: Veiculo
        -distancia: double
        +Viagem(LocalDate data, Motorista motorista, Veiculo veiculo, double distancia)
    }
    
    class Empresa {
        -viagem: Viagem
    }
    
    Empresa "1" o-- "0..*" Veiculo
    Empresa "1" o-- "0..*" Motorista
    Motorista "1" o-- "0..*" Veiculo
    Empresa "1" *-- "0..*" Viagem

````