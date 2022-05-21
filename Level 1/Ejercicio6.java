import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main (String[] args) {

        System.out.println("Escriba 2 numeros para calcular su potencia");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int resultado = 1;

        for(int i = 1; i <= y; i++) {
            resultado = resultado * x;
        }

        System.out.println(x + " elevado a " + y + " es = " + resultado);

    }
}
