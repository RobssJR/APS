package QuickSort;

public class QuickSort {
    public static void QuickSort(int v[]){
        System.out.println("Ordenação por QuickSort");
        qsort(v, 0, v.length - 1);
    }

    private static void qsort(int[]v, int inicio, int fim){
        int pivo;
        if(fim > inicio){
            pivo = particiona(v, inicio, fim);
            qsort(v, inicio, pivo - 1);
            qsort(v, pivo + 1, fim);
        }
    }

    private static int particiona(int []v, int inicio, int fim){
        // Seleciona o primeiro candidato a pivo


        int pivo = v[fim];
        System.out.printf("Primeiro candidato a pivo: %d\n", pivo);

        /*
        / Inicia o índice do menor elemento encontrado no momento
        */
        int i = (inicio - 1);

        System.out.printf("Valor de i: %d\n", i);
        for (int j = inicio; j <= fim - 1; j++) {
            // Se o menor elemento é menor que o pivo
            System.out.printf("Valor de j: %d\n", j);
            if (v[j] < pivo) {
                i++;    // Incrementa o índice do menor elemento
                System.out.printf("Novo valor de i: %d\n", i);
                System.out.printf("Troca %d <-> %d\n",v[i], v[j]);
                troca(v, i, j);
                printArray(v, inicio, fim);
            }
        }
        troca(v, i + 1, fim);
        System.out.printf("Troca %d <-> %d\n",v[i+1], v[fim]);
        printArray(v, inicio, fim);
        System.out.printf("Pivo final: %d\n", v[i+1]);
        return i + 1;
    }

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

    private static void troca(int v[], int pos1, int pos2 ){
        int aux;
        aux = v[pos1];
        v[pos1] = v[pos2];
        v[pos2] = aux;
    }
}
