package rtn.day1415.assignment1415;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] inputStrArr1 = new String[]{"zebra", "yellow", "apple", "eagle", "Rhythm"};
        String[] inputStrArr2 = new String[]{"ram", "shiv", "sankar", "Pygmy", "krishan"};
        System.out.println("\n\n***************************************** Capitalize the first letter of the each String in alphabetical order Using Steam ********************************************");
        System.out.print(Arrays.toString(inputStrArr1) + " :: ");
        System.out.println(Arrays.toString(CapitalizeAlphabeticalOrder.getUsingStream(inputStrArr1)));
        System.out.print(Arrays.toString(inputStrArr2) + " :: ");
        System.out.println(Arrays.toString(CapitalizeAlphabeticalOrder.getUsingStream(inputStrArr2)));


        System.out.println("\n\n***************************************** Capitalize the first letter of the each String in alphabetical order Using Lambda ********************************************");
        System.out.print(Arrays.toString(inputStrArr1) + " :: ");
        System.out.println(Arrays.toString(CapitalizeAlphabeticalOrder.getUsingLambda(inputStrArr1)));
        System.out.print(Arrays.toString(inputStrArr2) + " :: ");
        System.out.println(Arrays.toString(CapitalizeAlphabeticalOrder.getUsingLambda(inputStrArr2)));

        System.out.println("\n\n*****************************************  Strings that contains a vowels. Print string and number of Vowels ********************************************");
        System.out.print(Arrays.toString(inputStrArr1) + " :: ");
        System.out.println(Arrays.toString(ContainNumVol.getListContainsVowel(inputStrArr1)) + " ---> Count  " + Arrays.toString(ContainNumVol.getNoOfVowelsInString(ContainNumVol.getListContainsVowel(inputStrArr1))));
        System.out.print(Arrays.toString(inputStrArr2) + " :: ");
        System.out.println(Arrays.toString(ContainNumVol.getListContainsVowel(inputStrArr2)) + " ---> Count  " + Arrays.toString(ContainNumVol.getNoOfVowelsInString(ContainNumVol.getListContainsVowel(inputStrArr2))));


        System.out.println("\n\n*****************************************  The average of squares of all the odd numbers  **************************************************************");
        int[] inputIntArr1=new int[]{1,2,3,4,5,6};
        int[] inputIntArr2=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.print(Arrays.toString(inputIntArr1) + " :: Average  ");
        System.out.println(AverageSquare.getOfOddNumber(inputIntArr1));
        System.out.print(Arrays.toString(inputIntArr2) + " :: Average  ");
        System.out.println(AverageSquare.getOfOddNumber(inputIntArr2));

        System.out.println("\n\n*****************************************  Sort the array based on criteria  **************************************************************");
        System.out.print(Arrays.toString(inputStrArr1) + " :: Sorted  ");
        System.out.println(Arrays.toString(Sort.sortBasedOnLength(inputStrArr1)));
        System.out.print(Arrays.toString(inputStrArr2) + " :: Sorted  ");
        System.out.println(Arrays.toString(Sort.sortBasedOnLength(inputStrArr2)));

    }
}
