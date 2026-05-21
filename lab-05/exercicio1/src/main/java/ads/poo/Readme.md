````mermaid
classDiagram
    
    
    class Relogio{
        -ArrayList~Display~displays
        -horario: LocalDate
    }
    
    class Display{
        -numero: int
        -ArrayList~Segmento~segmentos
    }
    
    class Segmento{        
        -ligada: boolean
        +Segmento(double[] x, double[] y, Color cor)
        +isLigada()boolean
        +ligarDesligar()boolean
    }

    Segmento --* Display
    Display --* Relogio


````