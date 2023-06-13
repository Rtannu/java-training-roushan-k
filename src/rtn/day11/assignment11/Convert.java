package rtn.day11.assignment11;

public class Convert {

    static Integer stringToInteger(String input){
        Integer output=null;
        try {
             output=Integer.parseInt(input);
        }catch (Exception exception){
            System.out.println(input+" is invalid input");
        }
        return output;
    }
}
