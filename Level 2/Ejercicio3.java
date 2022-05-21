import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    
    public static void main (String[] args) {

        ArrayList<String> cartas = new ArrayList<>();
        Collections.addAll(cartas, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        
        System.out.println("Baraja Francesa: " + cartas);

        Collections.reverse(cartas);

        System.out.println("En orden inverso: " + cartas);

        Collections.shuffle(cartas);

        System.out.println("Mezcladas: " + cartas);

    }    
}
