package rtn.stream.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    static String[] sortBasedOnLength(String[] input) {
        return Arrays.stream(input).sorted(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                int l1 = s.length();
                int l2 = t1.length();
                if (l1 == l2) {
                    return -reverse(s).compareTo(reverse(t1));
                } else return l1 - l2;
            }
        }).toArray(String[]::new);
    }

    static String reverse(String input){
        StringBuilder inputStrBuilder=new StringBuilder(input);
        return inputStrBuilder.reverse().toString();
    }
}
