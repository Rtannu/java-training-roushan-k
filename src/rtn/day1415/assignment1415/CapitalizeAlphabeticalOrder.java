package rtn.day1415.assignment1415;

import java.util.Arrays;
import java.util.function.Function;

public class CapitalizeAlphabeticalOrder {

    static public String[] getUsingStream(String[] input) {

        return Arrays.stream(input).
                map(i -> i.substring(0, 1).toUpperCase() + i.substring(1)).
                sorted().
                toArray(String[]::new);
    }
    static public String[] getUsingLambda(String[] input) {

        Function<String[],String[]> functionLambda=(i)->{
            String[] result=new String[i.length];
            for (int idx=0;idx<i.length;idx++){
                result[idx]=(i[idx]).substring(0,1).toUpperCase()+(i[idx]).substring(1);
            }
            Arrays.sort(result);
            return result;
        };
        return functionLambda.apply(input);
    }
}
