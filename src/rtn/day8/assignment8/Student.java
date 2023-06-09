package rtn.day8.assignment8;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private String GPA;

    public Student() {
    }

    public Student(String firstName, String lastName, String GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA='" + GPA + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.lastName.compareTo(student.getLastName());
    }
}
