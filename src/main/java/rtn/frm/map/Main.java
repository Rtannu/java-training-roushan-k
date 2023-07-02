package rtn.frm.map;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        System.out.println("\n****************************************                   Question 1                     **************************************************************************");
        System.out.println("\n**************************************** Print using for Entry Set  **************************************************************************");
        Student.printUsingEntrySet();

        System.out.println("\n**************************************** Print using for Entry Set  **************************************************************************");
        Student.printForEachMtd();

        System.out.println("\n**************************************** Print using for Iterator  **************************************************************************");
        Student.printUsingIterator();

        System.out.println("\n****************************************                   Question 2                     **************************************************************************");
        System.out.println("\n**************************************** print all the distinct characters and number of times that character is repeated in the string  **************************************************************************");
        DistinctChar.printDisCharAndCount("test string");

        System.out.println("\n****************************************                   Question 3                     **************************************************************************");
        System.out.println("\n**************************************** find two numbers in the array that add up to the target sum  **************************************************************************");
        System.out.println(Arrays.toString(TargetSum.getIndies(new Integer[]{10,20,30,40,50,60},100)));



    }
}
