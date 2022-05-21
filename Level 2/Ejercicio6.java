import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Empleado {

    public String nombre;
    public int dni;
    public int horasTrabajadas;
    public int valorPorHora;

    public Empleado(int dni, String nombre, int horasTrabajadas, int valorPorHora) {

        this.dni = dni;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;

    }
}

public class Ejercicio6 {
    
    public static void main (String[] args) {

        Set<Empleado> empleados = new HashSet<Empleado>(); 
        HashMap<Integer,Integer> sueldos = new HashMap<Integer,Integer>();

        empleados.add(new Empleado(41758649, "Roberto Lopinilo", 8, 550));
        empleados.add(new Empleado(42574641, "Lupita Zapatero", 6, 350));
        empleados.add(new Empleado(36542869, "Pedro Pujol", 4, 200));
        empleados.add(new Empleado(21457152, "Maicol Jordan", 10, 700));

        for (Empleado i: empleados) {
            sueldos.put(i.dni, (i.horasTrabajadas * i.valorPorHora));
        }

        for (var entry: sueldos.entrySet()) {
            System.out.println("El empleado con DNI:" + entry.getKey() + " cobra la cantidad de:" + entry.getValue());
        }

    }
}
