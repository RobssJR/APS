package BinaryInsertionSort;

import java.util.Arrays;

public class Analise {
    public static void start (int[] lista) {
        double tempo;

        long tempo_inicial = System.nanoTime();
        BinaryInsertionSort.BinaryInsertionSort(lista);
        long tempo_final = System.nanoTime();

        tempo = (tempo_final - tempo_inicial) * 1e-9;

        System.out.println(tempo + " - " + lista.length );
    }
}
