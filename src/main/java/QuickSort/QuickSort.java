package QuickSort;

public class QuickSort {
    public static void QuickSort(int v[]){
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
        int pivo = v[fim];
        int i = (inicio - 1);

        for (int j = inicio; j <= fim - 1; j++) {
            if (v[j] < pivo) {
                i++;
                troca(v, i, j);
            }
        }
        troca(v, i + 1, fim);
        return i + 1;
    }

    private static void troca(int v[], int pos1, int pos2 ){
        int aux;
        aux = v[pos1];
        v[pos1] = v[pos2];
        v[pos2] = aux;
    }
}
