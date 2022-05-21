import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main (String[] args) {

        System.out.println("Ingrese un numero: ");

        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt(); 

        List<Integer> lista = new ArrayList<>();

        for(int i = 1; i <= valor;i++) {
            lista.add(i);
            System.out.println(lista);
        }
    }
}
