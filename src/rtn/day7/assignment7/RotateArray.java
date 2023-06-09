package rtn.day7.assignment7;

public class RotateArray {

    public static void rotateArray(int[] input,int index){
        ReverseArray.reverseArray(input,0,index-1);
        ReverseArray.reverseArray(input,index,input.length-1);
        ReverseArray.reverseArray(input,0,input.length-1);
    }
}
