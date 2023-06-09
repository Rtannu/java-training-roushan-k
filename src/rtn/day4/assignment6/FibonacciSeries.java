package rtn.day4.assignment6;

public class FibonacciSeries {

    public static void printFibonacciSeries(int num){
        if(num==0){
            System.out.println(0);
        }else if(num==1){
            System.out.println("0 1");
        }else {
            int curr=1;
            int pre=0;
            System.out.print("0 1 ");
            for(int i=1;i<num;i++){
                int next=curr+pre;
                pre=curr;
                curr=next;
                System.out.print(next+" ");
            }
            System.out.println();
        }
    }
}
