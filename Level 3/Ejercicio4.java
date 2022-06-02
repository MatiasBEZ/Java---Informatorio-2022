import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio4 {
    
    public static void main (String[] args) {

        List<Integer> numeros = List.of(1,2,3,5,5);
        List<Integer> factores = numeros.stream().map(x -> factorialStreams(x)).distinct().collect(Collectors.toList());
        System.out.println(factores);

    }

    public static int factorialStreams (int n) {
        return IntStream.rangeClosed(2,n).reduce(1,(x,y) -> x * y);
    }
}
