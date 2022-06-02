import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    
    public static void main (String[] args) {

        List<Integer> numeros = List.of(1,2,3,4,5);
        numeros = numeros.stream().map(x -> (int)Math.pow(x,2) ).collect(Collectors.toList());
        System.out.println(numeros);

    }
}
