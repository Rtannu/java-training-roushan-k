package rtn.day16.assignment16;

import java.util.ArrayList;

public class Convert {

    static String[] arrayListToArray(ArrayList<String> input){
        return input.stream().toArray(String[]::new);
    }
}
