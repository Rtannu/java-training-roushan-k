package rtn.day8.assignment8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class ReadCSVFile {

    static Student[] sortOnStudentLastName()  {
        String readLine = "";
        Student[] studentList=new Student[10];
        try {
            int index=0;
            BufferedReader br = new BufferedReader(new FileReader("src/rtn/day8/assignment8/student.csv"));
            while ((readLine = br.readLine()) != null) {
                String[] studentDetails = readLine.split(",");
                Student student=new Student();
                student.setFirstName(studentDetails[0]);
                student.setLastName(studentDetails[1]);
                student.setGPA(studentDetails[2]);
                studentList[index++]=student;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Arrays.sort(studentList);
        return studentList;
    }
}


