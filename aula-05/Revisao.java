void main() {

    // um vetor em Java é um objeto
    int[] vetor = new int[5];

    int tamanho = vetor.length; // tamanho é 5 (declarado no vetor acima)

    vetor[0] = 10; // 0 primeira posição
    vetor[4] = 90; // tamanho - 1 é a última posição do vetor

    int[] outra = { 3, 4, 5, 8 }; // declarando tamanho do vetor e elementos ao mesmo tempo

    int[][] matriz = new int[3][2]; // primeira linha e segundo coluna (na verdade não importa mas convencionamos a
                                    // usar assim)

    matriz[2][1] = 50; // última linha e última coluna (tamanho - 1 = posição)

    // vetor de 100 posições que inicia com números ímpares, começando em 3:

    int[] vet = new int[100];
    int n = 3;    
    for (int i = 0; i < vet.length; i++) {
        vet [i] = n;
        n = n + 2;            
        IO.println(vet[i]);
    }

}