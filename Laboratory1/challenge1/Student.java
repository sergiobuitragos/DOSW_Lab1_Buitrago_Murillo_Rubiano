public class Estudiante {

    private String nombreCompleto;
    private int edad;
    private String email;
    private int semestre;

    public Estudiante(String nombreCompleto, int edad, String email, int semestre) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.email = email;
        this.semestre = semestre;
    }

    public String getNombreCompleto() {
        return fullName;
    }

    public int getEdad() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getSemestre() {
        return semester;
    }
}
