````mermaid
    
classDiagram
    direction TB


    App *-- Gui
    Gui <|.. DadoGui
    Carta <|-- CartaGrafica
    Gui <|.. CartaGrafica
    Naipe --o Carta    
    Valor --o Carta
    Dado <|-- DadoGui
    
   
    
    class Dado{
        # face : int
        # est: int[]
        + jogar() int        
    }
    
    class DadoGui{     
      
    }
    
    class Gui{
        <<interface>>
        # x: int
        # y: int
        + desenhar(Draw d) void
        + clicouDentro(x: int, y: int) boolean
    }
    
    class App{
        - ArrayList ~Gui~ elementos
    }
    
    class CartaGrafica{       
        - virada: boolean                    
    }





````