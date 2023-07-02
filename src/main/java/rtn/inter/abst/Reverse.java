package rtn.inter.abst;

public class Reverse {

    public static String reverse(int number){
        String ans="";
        while (number>0){
            int digit=number%10;
            number=number/10;
            ans+= digit;
        }
        return ans;
    }

}
