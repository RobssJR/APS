import LerArquivo.LerArquivo;

public class Project {
    public static void main(String[] args) {
        BinaryInsertionSort.Analise.start(LerArquivo.read("./src/main/resources/numeros/1000_numbers.txt"));
    }
}
