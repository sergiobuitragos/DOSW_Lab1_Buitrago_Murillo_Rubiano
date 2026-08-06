/**
 * Represents a student with basic information.
 */
public class Student {
    
    private String fullName;

    private int age;

    private String email;

    private int semester;

    /**
     * Creates a new student with the provided information.
     *
     * @param fullName
     * @param age 
     * @param email 
     * @param semester 
     */
    public Student(String fullName, int age, String email, int semester) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.semester = semester;
    }

    /**
     * Returns the student's full name.
     *
     * @return the student's full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Returns the student's age.
     *
     * @return the student's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the student's email address.
     *
     * @return the student's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the student's current academic semester.
     *
     * @return the student's current academic semester
     */
    public int getSemester() {
        return semester;
    }
}
