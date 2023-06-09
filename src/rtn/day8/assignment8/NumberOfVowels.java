package rtn.day8.assignment8;

public class NumberOfVowels {

    public static int findNumberOfVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char lowerCaseChar = Character.toLowerCase(input.charAt(i));
            if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                count++;
            }
        }
        return count;
    }

}
