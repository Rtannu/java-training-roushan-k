import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input1 = new int[]{10, 3, 33, 2, -9, -2, 5};
        int[] input2 = new int[]{100, 30, 303, 20, -90, -20, 50000, 600};
        int[] input3 = new int[]{1011, 311, 3113, 211, -911, -211, 511, 611};
        int[] input4 = new int[]{1044, 333, 3333, 3332, 339, -5552, 225, 456786};
        System.out.println("*********************************** Max In Array *******************************************");
        System.out.println("Max in "+ Arrays.toString(input1)+" is "+MaxMinInArray.getMaxElementInArray(input1));
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