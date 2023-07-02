package rtn.hash.set;

public class Main {

    public static void main(String[] args){
        System.out.println("\n****************************************                   Question 1                     **************************************************************************");
        System.out.println("**************************************** Print using Iterator  **************************************************************************");
        HashSetIterate.printUsingIterator();

        System.out.println("\n**************************************** Print using ForEach  **************************************************************************");
        HashSetIterate.printForEachMtd();

        System.out.println("\n**************************************** Print using Steams forEach  **************************************************************************");
        HashSetIterate.printUsingStreamsForEach();

        System.out.println("**************************************** Remove all duplicate Character  **************************************************************************");
        System.out.println("abacbcdefdefghi :: "+Duplicate.remove("abacbcdefdefghi"));

    }
}
