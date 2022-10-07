package BinaryInsertionSort;

public class BinaryInsertionSort {
    public static void printArray(int v[], int inicio, int fim){
        if(fim != v.length)
            fim += 1;

        System.out.printf("Tamanho: %d\n", fim - inicio);

        if(v.length > 0)
            System.out.printf("[%d", v[inicio]);
        else
            System.out.printf("[");

        for(int i = inicio + 1; i < fim; i++)
            System.out.printf(", %d",v[i]);
        System.out.printf("]\n");
    }
    public static void BinaryInsertionSort(int v[]){
        System.out.println("Ordenação por BinaryInsertionSort");
        int i, local, j, escolhido;
        for (i = 1; i < v.length; i++){
            j = i;
            escolhido = v[i];
            System.out.printf("Escolhido = %d\n",escolhido);
            // Procura o local para inserir o atual
            local = buscabinaria(v, escolhido, 0, j);
            if(local == i)
                System.out.printf("%d já está na posição correta nesse passo\n", escolhido);
            else{
                System.out.printf("Coloca %d na frente do %d\n", escolhido, v[local]);
                // Move todos os elementos depois do local para a direita
                for ( ; j > 0 && escolhido < v[j-1]; j--) {
                    v[j] = v[j - 1];
                }
                v[j] = escolhido;
            }
            printArray(v, 0, v.length);
        }
    }

    private static int buscabinaria(int v[], int elem, int inicio, int fim){
        int meio = 0;

        while(inicio <= fim){
            meio = (int)Math.floor(inicio + fim) / 2;
            if(elem < v[meio]){
                fim = meio - 1; // Vai pra esquerda
                System.out.printf("Foi pra esquerda - fim = %d\n",fim);
            }else
            if(elem > v[meio]){
                inicio = meio + 1; // Vai pra direita
                System.out.printf("Foi pra esquerda - inicio = %d\n",inicio);
            }else{
                System.out.printf("Posição para inserir: %d\n", meio);
                break; // Elemento encontrado
            }
        }
        return meio; // Elemento não encontrado
    }
}