package rtn.stream.lambda;

import java.util.Arrays;

public class ContainNumVol {

    static public String[] getListContainsVowel(String[] input) {

        return Arrays.stream(input).
                filter(i -> i.toLowerCase().contains("a") ||
                        i.toLowerCase().contains("e") ||
                        i.toLowerCase().contains("i") ||
                        i.toLowerCase().contains("o") ||
                        i.toLowerCase().contains("u")).
                toArray(String[]::new);
    }

    static public Integer[] getNoOfVowelsInString(String[] input) {

        return Arrays.stream(input).
                map(i ->
                {
                    int count = 0;
                    for (int idx = 0; idx < i.length(); idx++) {
                        Character c = i.charAt(idx);
                        c=Character.toLowerCase(c);
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            count++;
                        }
                    }
                    return count;
                }).
                toArray(Integer[]::new);
    }
}
