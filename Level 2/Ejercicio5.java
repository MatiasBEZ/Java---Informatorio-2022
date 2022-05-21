import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {
    
    public static void main (String[] args) {

        ArrayList<Integer> horasTrabajadas = new ArrayList<>();
        ArrayList<Integer> valorHora = new ArrayList<>();
        ArrayList<Integer> totales = new ArrayList<>();
        int counter = 0;

        Collections.addAll(horasTrabajadas, 6,7,8,4,5);
        Collections.addAll(valorHora, 350,345,550,600,320);
        
        for (int i = 0; i < valorHora.size(); i++) {
            totales.add(horasTrabajadas.get(i) * valorHora.get(i));
            counter = counter + horasTrabajadas.get(i) * valorHora.get(i);
        }

        System.out.println(totales + "\n Total final: " + counter);

    }
}
