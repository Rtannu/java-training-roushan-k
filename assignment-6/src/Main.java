import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************************* Reverse of Digit *******************************************");
        Random random=new Random();
        for (int i=0;i<5;i++){
            int number=random.nextInt(20000000);
            System.out.println("Reverse of "+ number+" : "+Reverse.reverse(number));
        }

        System.out.println("\n\n****************************** Age *******************************************************");
        System.out.println("Age is 9 : "+PersonAge.checkAge(9));
        System.out.println("Age is 14 : "+PersonAge.checkAge(14));
        System.out.println("Age is 23 : "+PersonAge.checkAge(23));


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
        System.out.println("3 is "+FizzBuzz.printFizzBuzz(3));
        System.out.println("5 is "+FizzBuzz.printFizzBuzz(5));
        System.out.println("15 is "+FizzBuzz.printFizzBuzz(15));
    }
}