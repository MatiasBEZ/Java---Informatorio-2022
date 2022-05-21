import java.util.ArrayList;

public class Ejercicio7 {
    
    public static ArrayList<String> FizzBuzz(int a, int b) {

        ArrayList<String> resultados = new ArrayList<>();

        for (int i= a; i <b; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                resultados.add("FizzBuzz");
            } else if ( i % 2 == 0) {
                resultados.add("Fizz");
            } else if ( i % 3 == 0) {
                resultados.add("Buzz");
            } else {
                resultados.add(String.valueOf(i));
            }
        }

        return resultados;

    }

    public static void main (String[] args) {

        System.out.println(FizzBuzz(1,9));

    }
}
