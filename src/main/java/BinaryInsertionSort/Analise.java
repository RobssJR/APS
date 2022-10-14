package BinaryInsertionSort;

import java.util.Arrays;

public class Analise {
    public static void start (int[] lista) {
        double[] tempos = new double[5];
        long tempo_inicial;
        long tempo_final;

        for (int i = 0; i < tempos.length; i++) {
            tempo_inicial = System.nanoTime();
            BinaryInsertionSort.BinaryInsertionSort(lista);
            tempo_final = System.nanoTime();

            tempos[i] = (tempo_final - tempo_inicial) * 1e-9;
        }
        System.out.println();

        for (double tempo: tempos) {
            System.out.print(tempo);
            System.out.print(" - ");
        }
    }
}
