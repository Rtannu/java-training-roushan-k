package rtn.operator;

public class MaxMinInArray {

    public static int getMaxElementInArray(int[] input){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        return max;
    }

    public static int getMinElementInArray(int[] input){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]<min){
                min=input[i];
            }
        }
        return min;
    }
}
