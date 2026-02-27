package org.example.DAY4;
import java.util.*;
//Given a string s containing only the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//A string is valid if:
//
//Open brackets are closed by the same type of brackets.
//
//Open brackets are closed in the correct order.
//
//Every closing bracket has a corresponding opening bracket.
//
//Example 1
//Input: s = "()[]{}"
//Output: true
//
//Example 2
//Input: s = "(]"
//Output: false
public class P5 {

    public static boolean isValid(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

}
