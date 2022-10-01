import CalcularTempo.CalcularTempo;
import LerArquivo.LerArquivo;

public class Project {
    public static void main(String[] args) {
        LerArquivo.read("/src/main/resources/numeros/1000_numbers.txt");
        CalcularTempo.calcular();
    }
}
