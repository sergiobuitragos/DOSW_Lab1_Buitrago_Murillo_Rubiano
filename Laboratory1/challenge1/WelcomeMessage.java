
import java.util.List;

//Clase que maneja la estructura y organizacion del mensaje 
public class WelcomeMessage {
    // ponemos el dominio del correo como Static Final porque siempre es el mismo,
    // se peude completar
    // Ademas de que el dia que cambie, solo debemos cambiar una unica cosa en
    // codigo.
    private static final String DOMAIN = "@escuelaing.edu.co";

    private List<Student> students;

    public WelcomeMessage(List<Student> students) {
        this.students = students;
    }
}