package rtn.inter.abst;

public class FizzBuzz {

    public static String printFizzBuzz(int num){

        if(num%15==0){
            return "FizzBuzz";
        }else if(num%5==0){
            return "Buzz";
        }else if(num%3==0){
            return "Fizz";
        }else {
            return ""+num;
        }

    }
}
