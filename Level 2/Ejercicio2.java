import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main (String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros:");

        for (int i = 1; i <= 5; i++) {
            numeros.add(scan.nextInt());
        }

        imprimir(numeros);

        System.out.println("Agregar un numero al principio de la lista:");
        numeros.add(0, scan.nextInt());

        System.out.println("Agregar un numero al final:");
        numeros.add(scan.nextInt());
        
        imprimir(numeros);

    }

    public static void imprimir(ArrayList lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(" - " + lista.get(i) + " - ");
        }
        System.out.println("La lista contiene " + lista.size() + " elementos");

    }

}
