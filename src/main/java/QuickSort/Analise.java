package QuickSort;

import BinaryInsertionSort.BinaryInsertionSort;

public class Analise {
    public static void start (int[] lista) {
        double tempo;

        long tempo_inicial = System.nanoTime();
        QuickSort.QuickSort(lista);
        long tempo_final = System.nanoTime();

        tempo = (tempo_final - tempo_inicial) * 1e-9;

        System.out.println(tempo + " - " + lista.length );
    }
}
