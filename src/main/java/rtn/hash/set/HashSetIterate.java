package rtn.hash.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterate {

    HashSet<String> listOfStr=new HashSet<>();
    HashSetIterate(){
       listOfStr.add("Rama");
       listOfStr.add("Krishna");
       listOfStr.add("Sankar");
       listOfStr.add("Shiv");
       listOfStr.add("Lakshman");
       listOfStr.add("Hanuman");
       listOfStr.add("Divya");
       listOfStr.add("RK");
       listOfStr.add("Vishanu");
       listOfStr.add("Bramha");
    }

    static void printUsingIterator(){
        HashSetIterate hashSetIterate=new HashSetIterate();
        Iterator<String> hashSetIterateIterator=hashSetIterate.listOfStr.iterator();
        while (hashSetIterateIterator.hasNext()){
            System.out.println(hashSetIterateIterator.next());
        }
    }
    static void printForEachMtd(){
        HashSetIterate hashSetIterate=new HashSetIterate();
        Iterator<String> hashSetIterateIterator=hashSetIterate.listOfStr.iterator();
        for (String str: hashSetIterate.listOfStr
             ) {
            System.out.println(str);
        }
    }

    static void printUsingStreamsForEach(){
        HashSetIterate hashSetIterate=new HashSetIterate();
        hashSetIterate.listOfStr.stream().forEach(System.out::println);
    }
}
