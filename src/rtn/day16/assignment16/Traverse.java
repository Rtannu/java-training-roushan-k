package rtn.day16.assignment16;

import java.util.ArrayList;
import java.util.Iterator;

public class Traverse {

    static void forLoop(ArrayList<String> input){
        for(int i=0;i<input.size();i++){
            System.out.println(input.get(i));
        }
    }

    static void enhancedForLoop(ArrayList<String> input){
        for(String item:input){
            System.out.println(item);
        }
    }

    static void iterator(ArrayList<String> input){
        Iterator<String> iterator=input.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    static void forEach(ArrayList<String> input){
            input.forEach(System.out::println);
    }

    static void parallelStream(ArrayList<String> input){
            input.parallelStream().forEach(System.out::println);
    }

}
