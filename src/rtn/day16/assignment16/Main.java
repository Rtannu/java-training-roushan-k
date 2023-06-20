package rtn.day16.assignment16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String[] args){
        ArrayList<String> inputArrayList= new ArrayList<>();
        inputArrayList.add("ram");
        inputArrayList.add("Angular");
        inputArrayList.add("Mohan");
        inputArrayList.add("Shiva");
        inputArrayList.add("Sita");
        inputArrayList.add("krishan");
        inputArrayList.add("Java");

        System.out.println("\n****************************************                   Question 1                     **************************************************************************");
        System.out.println("\n**************************************** traverse all elements of the list using for loop **************************************************************************");
        Traverse.forLoop(inputArrayList);

        System.out.println("\n**************************************** traverse all elements of the list using enhanced for loop **************************************************************************");
        Traverse.enhancedForLoop(inputArrayList);

        System.out.println("\n**************************************** traverse all elements of the list using iterator **************************************************************************");
        Traverse.iterator(inputArrayList);

        System.out.println("\n**************************************** traverse all elements of the list using forEach **************************************************************************");
        Traverse.forEach(inputArrayList);

        System.out.println("\n**************************************** traverse all elements of the list using parallel steam **************************************************************************");
        Traverse.parallelStream(inputArrayList);

        System.out.println("\n\n****************************************                   Question 2                    **************************************************************************");
        System.out.println("****************************************    remove the last object in the ArrayList         **************************************************************************");
        System.out.print(inputArrayList+" :: ");
        System.out.println(Remove.lastObject(inputArrayList));


        ArrayList<Student> studentArrayList=new ArrayList<>();
        studentArrayList.add(new Student("Rama","K",4.0D));
        studentArrayList.add(new Student("Shiv","Ch",3.0D));
        studentArrayList.add(new Student("Krishan","Kh",3.4D));
        studentArrayList.add(new Student("Mohan","Sh",2.9D));
        studentArrayList.add(new Student("Rakesh","Kr",3.66D));

        System.out.println("\n\n****************************************                   Question 3                    **************************************************************************");
        System.out.println("****************************************    remove all the students who has GPA less than the average GPA         **************************************************************************");
        System.out.print("StudentList ---> "+studentArrayList);
        ArrayList<Student> result=Student.removeBelowAverage(studentArrayList);
        System.out.println("\nAfter Removal --->");
        System.out.println(result);


        System.out.println("\n\n****************************************                   Question 4                    **************************************************************************");
        System.out.println("****************************************    convert ArrayList into an Array         **************************************************************************");
        System.out.print("ArrayList ---> "+inputArrayList+" :: Array --->");
        System.out.println(Arrays.toString(Convert.arrayListToArray(inputArrayList)));





    }
}
