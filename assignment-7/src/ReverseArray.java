public class ReverseArray {

    static void reverseArray(int[] input,int start ,int end){
        while (start<end){
            int temp=input[start];
            input[start]=input[end];
            input[end]=temp;
            start++;
            end--;
        }
    }
}
