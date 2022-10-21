import LerArquivo.LerArquivo;

import java.util.Random;

public class Project {
    public static void main(String[] args) {

        String[] arquivos = new String[] {
                "./src/main/resources/numeros/1000_numbers.txt",
                "./src/main/resources/numeros/5000_numbers.txt",
                "./src/main/resources/numeros/10000_numbers.txt"
        };

        //Analise dos piores casos
        System.out.println("Piores casos");

        System.out.println("\nBinaryInsertionSort");
        for (int i = 1; i <= 10; i++) {
            BinaryInsertionSort.Analise.start(
                    LerArquivo.read("./src/main/resources/numeros/random_" + i + ".txt")
            );
        }

        System.out.println("\nSelectionSort");
        for (int i = 1; i <= 10; i++) {
            SelectionSort.Analise.start(
                    LerArquivo.read("./src/main/resources/numeros/random_" + i + ".txt")
            );
        }

        /*System.out.println("\nQuickSort");
        for (int i = 1; i <= 10; i++) {
            QuickSort.Analise.start(
                    LerArquivo.read("./src/main/resources/numeros/random_" + i + ".txt") // Esta dando stackoverflow
            );
        }*/

        //Analise randomico
        System.out.println("Casos randomicos");

        System.out.println("\nQuickSort");
        for (int i = 0; i < arquivos.length; i++) {
            QuickSort.Analise.start(
                    LerArquivo.read(arquivos[i])
            );
        }

        System.out.println("\nBinaryInsertionSort");
        for (int i = 0; i < arquivos.length; i++) {
            BinaryInsertionSort.Analise.start(
                    LerArquivo.read(arquivos[i])
            );
        }
        System.out.println("\nSelectionSort");
        for (int i = 0; i < arquivos.length; i++) {
            SelectionSort.Analise.start(
                    LerArquivo.read(arquivos[i])
            );
        }
    }
}
