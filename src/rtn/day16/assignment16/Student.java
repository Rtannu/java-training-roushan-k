package rtn.day16.assignment16;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private Double GPA;

    public Student(String firstName, String lastName, Double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public Student() {
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

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    static ArrayList<Student> removeBelowAverage(ArrayList<Student> studentArrayList){
        Double average=studentArrayList.parallelStream().map(Student::getGPA).mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("\nAverage GPA :: "+average);
        for (int i=0;i<studentArrayList.size();i++){
            if (studentArrayList.get(i).getGPA()<average)
                studentArrayList.remove(i);
        }
        return studentArrayList;
    }
}
