package rtn.str.question;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean isAnagram(String input1, String input2) {
        int inputLenFirst = input1.length();
        int inputLenSecond = input2.length();
        if (inputLenFirst != inputLenSecond) {
            return false;
        }

        HashMap<Character, Integer> mapCountInputFirst = new HashMap<>();
        HashMap<Character, Integer> mapCountInputSecond = new HashMap<>();
        for (int i = 0; i < input1.length(); i++) {
            Character c = input1.charAt(i);
            Integer count = mapCountInputFirst.get(c);
            if (count == null) {
                mapCountInputFirst.put(c, 1);
            } else {
                mapCountInputFirst.put(c, count + 1);
            }
        }

        for (int i = 0; i < input2.length(); i++) {
            Character c = input2.charAt(i);
            Integer count = mapCountInputSecond.get(c);
            if (count == null) {
                mapCountInputSecond.put(c, 1);
            } else {
                mapCountInputSecond.put(c, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapCountInputFirst.entrySet()) {
            Character c = entry.getKey();
            Integer firstInputCount = entry.getValue();
            Integer secondInputCount = mapCountInputSecond.get(c);
            if (secondInputCount == null || firstInputCount != secondInputCount) {
                return false;
            }
        }
        return true;
    }
}
