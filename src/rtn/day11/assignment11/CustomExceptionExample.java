package rtn.day11.assignment11;

public class CustomExceptionExample {

    static void divide(int firstNumber,int secondNumber){
        try {
            Integer output=firstNumber/secondNumber;
        }catch (ArithmeticException arithmeticException){
            throw new ArithmeticCustomException("Number Divided by zero");
        }

    }
}
