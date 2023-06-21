package rtn.day17.assignment17;

import java.util.HashMap;
import java.util.Map;

public class DistinctChar {

    static void printDisCharAndCount(String input){
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        for(int i=0;i<input.length();i++){
            Character ch=input.charAt(i);
            if(ch.toString().trim().length()==0){
                continue;
            }
            Integer count=characterIntegerMap.get(ch);
            if(count==null){
                characterIntegerMap.put(ch,1);
            }else characterIntegerMap.put(ch,count+1);
        }

        characterIntegerMap.entrySet().forEach(System.out::println);
    }
}
