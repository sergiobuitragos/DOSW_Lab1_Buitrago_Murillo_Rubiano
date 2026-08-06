
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que maneja la estructura y organizacion del mensaje
 */
public class WelcomeMessage {
    /**
     * ponemos el dominio del correo como Static Final porque siempre es el mismo,
     * se peude completar
     * Ademas de que el dia que cambie, solo debemos cambiar una unica cosa en
     * codigo
     */
    private static final String DOMAIN = "@escuelaing.edu.co";

    private List<Student> students;

    public WelcomeMessage(List<Student> students) {
        this.students = students;
    }

    /**
     * Recorre la lista de estudiantes y construye el párrafo final
     * con todas las descripciones unidas.
     */
    public String InfoStudent() {
        return students.stream()
                .map(this::describeStudent)
                .collect(Collectors.joining(",\nand "));
    }

    /**
     * Armo la descripcion textual de un solo estudiante, con los getters(Solo
     * refenci, no repito codigo)
     */
    private String describeStudent(Student s) {
        return s.getFullName() + ", a " + s.getSemester() + "th-semester student, "
                + s.getAge() + "years old";
    }

    // Ahora construyo el correo con el prefixName y el Domain
    public String emailConstruction() {
        return students.stream()
                // Student::getEmail hace referencia al metodo getEmail de la clase Student, que
                // retorna el prefixEmail
                // por cada estudiante, obtiene directamente su correo (s -> s.getEmail())
                .map(Student::getEmail)
                .collect(Collectors.joining("\n"));
    }

    public void printWelcome() {
        System.out.println("Hello and welcome!\n");
        System.out.println("we ara" + InfoStudent() + ".\n");
        System.out.println("Our institutional emails are!");
        System.out.println(emailConstruction());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Miguel Murillo", 22, "Miguel.Murillo-h" + DOMAIN, 6);
        Student student2 = new Student("Sergio Buitrado", 21, "Sergio.buitrago-s" + DOMAIN, 7);
        Student student3 = new Student("Juanita Rubiano", 21, "juanita.rubiano-f" + DOMAIN, 6);
        List<Student> students = List.of(student1, student2, student3);

        WelcomeMessage welcomeMessage = new WelcomeMessage(students);
        welcomeMessage.printWelcome();
    }

}