package rtn.frm.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;
    private Double GPA;

    private HashMap<String,Student> studentHashMap;

    public Student(String firstName, String lastName, Double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public Student() {

        studentHashMap=new HashMap<>();
        Student student1=new Student("Rama","Kr",5.6);;
        Student student2=new Student("Shiva","Gd",5.8);;
        Student student3=new Student("Sita","Gd",5.9);;
        Student student4=new Student("Divya","Rd",5.1);;
        Student student5=new Student("Ravan","Pg",5.2);;
        Student student6=new Student("Shayam","Si",5.3);;
        Student student7=new Student("Romam","Jhon",5.4);;
        Student student8=new Student("Priyanka","Kri",5.5);;
        studentHashMap.put(student1.getFirstName(),student1);
        studentHashMap.put(student2.getFirstName(),student2);
        studentHashMap.put(student3.getFirstName(),student3);
        studentHashMap.put(student4.getFirstName(),student4);
        studentHashMap.put(student5.getFirstName(),student5);
        studentHashMap.put(student6.getFirstName(),student6);
        studentHashMap.put(student7.getFirstName(),student7);
        studentHashMap.put(student8.getFirstName(),student8);
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

    static void printUsingEntrySet(){
        Student student=new Student();
        student.studentHashMap.entrySet().forEach(System.out::println);
    }
    static void printForEachMtd(){
        Student student=new Student();
        for (Map.Entry<String,Student> entry:
             student.studentHashMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

    static void printUsingIterator(){
        Student student=new Student();
        Iterator iterator=student.studentHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
