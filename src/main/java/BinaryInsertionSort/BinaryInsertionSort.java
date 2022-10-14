package BinaryInsertionSort;

public class BinaryInsertionSort {
    public static void printArray(int v[], int inicio, int fim){
        if(fim != v.length)
            fim += 1;

        if(v.length > 0)
            System.out.printf("[%d", v[inicio]);
        else
            System.out.printf("[");

        for(int i = inicio + 1; i < fim; i++)
            System.out.printf(", %d",v[i]);
        System.out.printf("]\n");
    }
    public static void BinaryInsertionSort(int v[]){
        int i, local, j, escolhido;

        for (i = 1; i < v.length; i++){
            j = i;
            escolhido = v[i];

            local = buscabinaria(v, escolhido, 0, j);

            if (local != i) {
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
                fim = meio - 1;
            }else
            if(elem > v[meio]){
                inicio = meio + 1;
            }else{
                break;
            }
        }

        return meio;
    }
}
