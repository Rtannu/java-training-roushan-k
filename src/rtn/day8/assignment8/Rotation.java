package rtn.day8.assignment8;

import java.util.LinkedList;
import java.util.Queue;

public class Rotation {

    static boolean isOneStringIsRotationOfAnotherString(String input1,String input2){
        int inputFirstLen=input1.length();
        int inputSecondLen=input2.length();
        if(inputFirstLen!=inputSecondLen) return false;

        Queue<Character> queueFirst=new LinkedList<>();
        for(int i=0;i<inputFirstLen;i++){
                queueFirst.add(input1.charAt(i));
        }

        Queue<Character> queueSecond=new LinkedList<>();
        for(int i=0;i<inputSecondLen;i++){
            queueSecond.add(input2.charAt(i));
        }
        for (int i=0;i<inputFirstLen;i++){
            Character inputFirstChar=queueFirst.peek();
            queueFirst.remove();
            queueFirst.add(inputFirstChar);
            if(queueFirst.equals(queueSecond)) return true;
        }
        return false;
    }
}
