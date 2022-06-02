import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main (String[] args) {
        
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("informatorio");
        palabras.add("");
        palabras.add("2022");

        palabras = palabras.stream().filter(x -> x != null).filter(x -> x != "").collect(Collectors.toList());
        System.out.println(palabras);

    }
}