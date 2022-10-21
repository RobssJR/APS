package BinaryInsertionSort;

public class BinaryInsertionSort {
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
        }
    }

    private static int buscabinaria(int v[], int elem, int inicio, int fim) {
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
