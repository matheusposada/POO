````mermaid
classDiagram
    
    
    class Personagem{
        <<abstract>>
        -vida: int
        -ataque: int
        -velocidade:double
        +Personagem(int vida, int ataque, double velocidade)
        +atacar()String
        +mover()String
    }
    class Aldeao{
        
    }
    class Arqueiro{
        
    }
    class Cavaleiro{
        
    }
    
    Aldeao --|> Personagem
    Arqueiro --|> Personagem
    Cavaleiro --|> Personagem
    



````