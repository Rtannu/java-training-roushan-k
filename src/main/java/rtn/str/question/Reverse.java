package rtn.str.question;

import java.util.Stack;

public class Reverse {

    static char[] reverseEachWordInSentence(String input) {
        int inputLen = input.length();
        char[] reversedInput = new char[inputLen];
        int index = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputLen; i++) {
            Character inputChar = input.charAt(i);
            if (input.charAt(i) != ' ') {
                stack.push(inputChar);
            } else {
                while (!stack.isEmpty()) {
                    reversedInput[index++] = stack.pop();
                }
                reversedInput[index++] = ' ';
            }
        }
        while (!stack.isEmpty()) {
            reversedInput[index++] = stack.pop();
        }
        return reversedInput;
    }
}
