import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Alumno {

    private String apellido; 
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private int añoActual = Year.now().getValue();

    public Alumno(String apellido, String nombre, LocalDate fecha) {

        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fecha;

    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getNombreCompleto() {
        return Stream.of(apellido,nombre).collect(Collectors.joining(" "));
    }

    public Integer getEdad() {
        return añoActual - fechaDeNacimiento.getYear();
    }
}

public class Ejercicio5 {

    public static void main (String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("d-MM-yyyy");

        List<Alumno> alumnos = List.of(
            new Alumno("Ayala","Paprika",LocalDate.parse("01-10-1998", df)),
            new Alumno("Benitez","Gaston",LocalDate.parse("08-09-1963", df)),
            new Alumno("Cabrera","Paula",LocalDate.parse("31-12-1993", df)),
            new Alumno("Ramirez","Lautaro",LocalDate.parse("27-07-2003", df)),
            new Alumno("Tepes","Vlad",LocalDate.parse("20-03-1431", df))
        );

        Map<String,Integer> mapaAlumnos = alumnos.stream().collect(Collectors.toMap(Alumno::getNombreCompleto, Alumno::getEdad));
        
        System.out.println(mapaAlumnos);

    }
}
