import rtn.day3.assignment3.*;
import rtn.day4and5.assignment4and5.ChildClass;
import rtn.day4and5.assignment4and5.FinalClass;
import rtn.day4and5.assignment4and5.Phone;
import rtn.day4and5.assignment4and5.StaticMtdVarClass;
import rtn.day4.assignment6.FibonacciSeries;
import rtn.day4.assignment6.FizzBuzz;
import rtn.day4.assignment6.PersonAge;
import rtn.day4.assignment6.Reverse;
import rtn.day7.assignment7.MaxMinInArray;
import rtn.day7.assignment7.ReverseArray;
import rtn.day7.assignment7.RotateArray;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /*************************** Assignment 3 ****************************************************/
        // Department | abstract
        Department department = new ComputerScienceDepartment();
        int departmentSize = department.getDepartmentSize();
        System.out.println("Department Size=" + departmentSize);

        // Product | Overloading
        Product product = new Product();
        double productPrice = product.getPrice(5);
        System.out.println("Product Price =" + productPrice);

        // Run Time Runtime Polymorphism
        Bird bird = new EagleBird();
        bird.display();

        /*************************** Assignment 4 and 5  ****************************************************/


        // Question 1
        Phone phone = new Phone();
        phone.displayAndroid();
        phone.displayApple();

        // Question 2
        ChildClass childClass = new ChildClass(1, 2);
        System.out.println("Parent Class Var = " + childClass.getParentVar());
        System.out.println("Child Class Var = " + childClass.getChildVar());

        // Question 3
        System.out.println("Static Variable = " + StaticMtdVarClass.getClassVar());

        // Question 4
        FinalClass finalClass = new FinalClass();
        System.out.println("Final Class Var = " + finalClass.getFINAL_VAR());


        /*************************** Assignment 6  ****************************************************/

        System.out.println("********************************* Reverse of Digit *******************************************");
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(20000000);
            System.out.println("Reverse of " + number + " : " + Reverse.reverse(number));
        }

        System.out.println("\n\n****************************** Age *******************************************************");
        System.out.println("Age is 9 : " + PersonAge.checkAge(9));
        System.out.println("Age is 14 : " + PersonAge.checkAge(14));
        System.out.println("Age is 23 : " + PersonAge.checkAge(23));


        System.out.println("\n\n****************************** FibonacciSeries *******************************************************");
        System.out.print("FibonacciSeries of 0 : ");
        FibonacciSeries.printFibonacciSeries(0);
        System.out.println();
        System.out.print("FibonacciSeries of 1 : ");
        FibonacciSeries.printFibonacciSeries(1);
        System.out.println();
        System.out.print("FibonacciSeries of 5 : ");
        FibonacciSeries.printFibonacciSeries(5);
        System.out.println();
        System.out.print("FibonacciSeries of 10 : ");
        FibonacciSeries.printFibonacciSeries(10);


        System.out.println("\n\n****************************** FizzBuzz *******************************************************");
        System.out.println("3 is " + FizzBuzz.printFizzBuzz(3));
        System.out.println("5 is " + FizzBuzz.printFizzBuzz(5));
        System.out.println("15 is " + FizzBuzz.printFizzBuzz(15));



        /*************************** Assignment 7  ****************************************************/


        int[] input1 = new int[]{10, 3, 33, 2, -9, -2, 5};
        int[] input2 = new int[]{100, 30, 303, 20, -90, -20, 50000, 600};
        int[] input3 = new int[]{1011, 311, 3113, 211, -911, -211, 511, 611};
        int[] input4 = new int[]{1044, 333, 3333, 3332, 339, -5552, 225, 456786};
        System.out.println("*********************************** Max In Array *******************************************");
        System.out.println("Max in "+ Arrays.toString(input1)+" is "+ MaxMinInArray.getMaxElementInArray(input1));
        System.out.println("Max in "+ Arrays.toString(input2)+" is "+MaxMinInArray.getMaxElementInArray(input2));
        System.out.println("Max in "+ Arrays.toString(input3)+" is "+MaxMinInArray.getMaxElementInArray(input3));
        System.out.println("Max in "+ Arrays.toString(input4)+" is "+MaxMinInArray.getMaxElementInArray(input4));

        System.out.println("\n\n*********************************** Min In Array *******************************************");
        System.out.println("Min in "+ Arrays.toString(input1)+" is "+MaxMinInArray.getMinElementInArray(input1));
        System.out.println("Min in "+ Arrays.toString(input2)+" is "+MaxMinInArray.getMinElementInArray(input2));
        System.out.println("Min in "+ Arrays.toString(input3)+" is "+MaxMinInArray.getMinElementInArray(input3));
        System.out.println("Min in "+ Arrays.toString(input4)+" is "+MaxMinInArray.getMinElementInArray(input4));

        System.out.println("\n\n*********************************** Reverse of Array *******************************************");
        System.out.print("Reverse of "+ Arrays.toString(input1)+" is ");
        ReverseArray.reverseArray(input1,0,input1.length-1);
        System.out.println(Arrays.toString(input1));
        System.out.print("Reverse of "+ Arrays.toString(input2)+" is ");
        ReverseArray.reverseArray(input2,0,input2.length-1);
        System.out.println(Arrays.toString(input2));
        System.out.print("Reverse of "+ Arrays.toString(input3)+" is ");
        ReverseArray.reverseArray(input3,0,input3.length-1);
        System.out.println(Arrays.toString(input3));
        System.out.print("Reverse of "+ Arrays.toString(input4)+" is ");
        ReverseArray.reverseArray(input4,0,input4.length-1);
        System.out.println(Arrays.toString(input4));

        System.out.println("\n\n*********************************** Rotate Array *******************************************");
        System.out.print("Rotate the array left by 1 "+ Arrays.toString(input1)+" is ");
        RotateArray.rotateArray(input1,1);
        System.out.println(Arrays.toString(input1));
        System.out.print("Rotate the array left by 2 "+ Arrays.toString(input2)+" is ");
        RotateArray.rotateArray(input2,2);
        System.out.println(Arrays.toString(input2));
        System.out.print("Rotate the array left by 3 "+ Arrays.toString(input3)+" is ");
        RotateArray.rotateArray(input3,3);
        System.out.println(Arrays.toString(input3));
        System.out.print("Rotate the array left by 4 "+ Arrays.toString(input4)+" is ");
        RotateArray.rotateArray(input4,4);
        System.out.println(Arrays.toString(input4));

    }
}
