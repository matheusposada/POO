```mermaid
classDiagram 
    direction LR

class App{
    
}

class Agenda{
    
}


class Contato{   
    
}

class ColecaoTelefone{
    
}

class ColecaoEmail{
    
}
App ..> Contato
App "1" *-- "1" Agenda
Agenda "1" *--"0..*" Contato
Contato "1" *-- "0..*" ColecaoTelefone
Contato "1" *-- "0..*" ColecaoEmail

```