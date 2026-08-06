public class Student {
    private String fullName;
    private int age;
    private String email;
    private int semester;

    public Student(String fullName, int age, String email, int semester) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.semester = semester;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getSemester() {
        return semester;
    }
}
