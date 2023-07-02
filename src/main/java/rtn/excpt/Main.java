package rtn.excpt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*******************************************     converts given string into an integer ***********************************************/
        System.out.println("*******************************************     converts given string into an integer ***********************************************\n\n");
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while (true) {
            System.out.println("Enter the input");
            input = scanner.nextLine();
            Integer output = Convert.stringToInteger(input);
            System.out.println("OUTPUT :: " + output);
            System.out.println("To Exit from program, Plz enter 0 otherwise enter anything");
            Integer flag = scanner.nextInt();
            if (flag == 0) {
                System.out.println("*************************************        Existing from program         *************************************");
                break;
            }
            scanner.nextLine();
        }

        /*******************************************     Catch a runtime exception  ***********************************************/
        System.out.println("\n\n\n\n*******************************************     Catch a runtime exception ***********************************************");
        try {
            CustomExceptionExample.divide(100, 0);
        } catch (ArithmeticCustomException arithmeticCustomException) {
            System.out.println(arithmeticCustomException.getMessage());
        }

    }
}
