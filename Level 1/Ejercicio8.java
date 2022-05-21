import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();

        System.out.println("Ingrese su edad: ");
        String edad = scan.nextLine();

        System.out.println("Ingrese su direccion: ");
        String dire = scan.nextLine();

        System.out.println("Ingrese su ciudad: ");
        String ciudad = scan.nextLine();
        
        System.out.println(ciudad + " - " + dire + " - " + edad + " - " + nombre);

    }
}
