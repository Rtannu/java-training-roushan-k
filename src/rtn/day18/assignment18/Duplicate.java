package rtn.day18.assignment18;

import java.util.HashSet;

public class Duplicate {

    static String remove(String input){
        HashSet<Character> result=new HashSet<>();
        String finalResult="";
        for (int i=0;i<input.length();i++){
            if(result.add(input.charAt(i))){
                finalResult+=input.charAt(i);
            }
        }
        return finalResult;
    }
}
