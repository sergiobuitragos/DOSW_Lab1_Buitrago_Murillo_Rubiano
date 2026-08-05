
//Challenge1
// Welcome Message

public class Student {

    private String name;
    private int age;
    private String emailPrefix;
    private int semester;

    public Student(String name, int age, String email, int semester) {
        this.name = name;
        this.age = age;
        this.emailPrefix = email;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailPrefixString() {
        return emailPrefix;
    }

    public int getSemester() {
        return semester;
    }
}
