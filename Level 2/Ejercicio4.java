import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {

    public static void main (String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();
        Collections.addAll(estudiantes, "Barrios Miguel",
          "Perez Ivan", "Molina Gimena", "Martinez Pedro", "Alvarez Jose",
          "Zurem Ana", "Sosa Silvio", "Xiom David", "Castro Cristian",
          "Rolmo leo", "Jimenez Saul", "Olivos Viviana");
        
        System.out.println("Lista completa de alumnos: " + estudiantes);
        System.out.println("Curso 1: " + estudiantes.subList(0,4));
        System.out.println("Curso 2: " + estudiantes.subList(4,8));
        System.out.println("Curso 3: " + estudiantes.subList(8,12));

    } 
}