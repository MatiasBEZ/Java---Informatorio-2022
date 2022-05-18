import java.util.Scanner;

public class Ejercicio9 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.println("Ingrese el texto: ");
        String str = scan.nextLine();

        System.out.println("Ingrese el caracter a contar: ");
        char carac = scan.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == carac) {
                count++;
            }
        }

        System.out.println("El caracter " + carac + " aparece " + count + " veces.");
        
    }

}