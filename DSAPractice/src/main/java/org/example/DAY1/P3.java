package org.example.DAY1;

import java.util.HashMap;
import java.util.Map;

//Valid Anagram
//Example 1:
//
//Input: s = "racecar", t = "carrace"
//
//Output: true
//Example 2:
//
//Input: s = "jar", t = "jam"
//
//Output: false
public class P3 {
    public static boolean isAnagram(String s, String t) {

        if (s==null || t==null) {
            throw new IllegalArgumentException("Input strings must not be null");
        }

        if (s.length()!=t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch:s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        for (char ch:t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }


        for (int count: map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        try {
            boolean result = isAnagram(s1, s2);
            System.out.println("Are anagrams? " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
