import LerArquivo.LerArquivo;

import java.util.Random;

public class Project {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            BinaryInsertionSort.Analise.start(
                    LerArquivo.read("./src/main/resources/numeros/random_" + i + ".txt")
            );
        }
    }
}
