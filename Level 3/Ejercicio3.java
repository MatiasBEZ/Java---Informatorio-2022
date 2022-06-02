import java.util.List;

public class Ejercicio3 {
    
    public static void main (String[] args) {

        List<String> palabras = List.of("Batman", "espaiderman", "Bocaman",
        "Wandavision", "brainiac", "Daredevil");
        Long contador = palabras.stream().filter(x -> x.toUpperCase().startsWith("B")).count();

        System.out.println(contador);

    }
}
