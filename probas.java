import java.util.Arrays;
import java.util.List;

public class probas {

    public static void main(String[] args) {
        System.out.println("BOS DIAS");
        List<String> Semaforo = Arrays.asList("vermello", "laranxa", "verde");
        System.out.println(Semaforo.get(2));
        System.out.println(Semaforo.get(1));
        System.out.println(Semaforo.get(0));
    }
}