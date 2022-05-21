import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main (String[] args) {

        System.out.println("Ingrese dos numero:");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int suma = x + y;
        int resta = x - y;
        int multi = x * y;
        int division = x/y;
        int modulo = x % y;

        System.out.println(x + " + " + y + " = " +suma+ 
        "\n" + x + " - " + y + " = "  +resta+
        "\n" + x + " * " + y + " = "  +multi+
        "\n" + x + " / " + y + " = "  +division+
        "\n" + x + " % " + y + " = "  +modulo);

    }
}
