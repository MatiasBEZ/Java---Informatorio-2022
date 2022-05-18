import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main (String[] args) {

        System.out.println("Ingrese 2 numeros para obtener multiplicacion por sumas sucesivas");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int resultado = 0;

        for(int i = 1; i <= y; i++) {
            resultado = resultado + x;
        }

        System.out.println(x + " X " + y + " = " + resultado);

    }

}
