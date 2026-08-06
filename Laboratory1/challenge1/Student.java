public class Student {

    private String fullName;
    private int age;
    private String prefixEmail;
    private int semester;

    public Student(String fullName, int age, String prefixEmail, int semester) {
        this.fullName = fullName;
        this.age = age;
        this.prefixEmail = prefixEmail;
        this.semester = semester;
    }

    public String getNombreCompleto() {
        return fullName;
    }

    public int getEdad() {
        return age;
    }

    public String getEmail() {
        return prefixEmail;
    }

    public int getSemester() {
        return semester;
    }
}
