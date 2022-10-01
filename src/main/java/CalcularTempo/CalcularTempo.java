package CalcularTempo;

public class CalcularTempo {
    
    public static void calcular(){
        long tempo_inicial = System.nanoTime();
        long tempo_final = System.nanoTime();
        double seconds = (tempo_final - tempo_inicial) * 1e-9;
        System.out.printf("%.9f segundos\n",seconds);
    }
}
