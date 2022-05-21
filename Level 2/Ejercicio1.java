import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String[] args) {

        ArrayList<String> ciudades = new ArrayList<>();
        System.out.println("Ingrese sus ciudades favoritas del pais:");
        Scanner scan = new Scanner(System.in);

        while (true) {
            ciudades.add(scan.nextLine());

            System.out.println("agregar otra ciudad? si/no");
            String answer = scan.nextLine();

            if (answer.equals("no")) {
                break;
            }

        }

        for (int i = 0; i < ciudades.size(); i++) {
            int rank = i + 1;
            System.out.println("#" + rank + " - " + ciudades.get(i));
        }
    }
}