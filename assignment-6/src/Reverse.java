public class Reverse {

    static int reverse(int number){
        int ans=0;
        while (number>0){
            int digit=number%10;
            number=number/10;
            ans=ans*10+digit;
        }

        return ans;
    }

}
