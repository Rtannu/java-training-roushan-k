package rtn.arr.question;

import java.util.ArrayList;

public class Remove {

    static ArrayList<String> lastObject(ArrayList<String> inputList){
        inputList.remove(inputList.size()-1);
        return inputList;
    }
}
