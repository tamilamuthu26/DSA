package org.example.DAY1;

import java.util.*;

//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
//
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//
//Example 1:
//
//Input: strs = ["act","pots","tops","cat","stop","hat"]
//
//Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
//Example 2:
//
//Input: strs = ["x"]
//
//Output: [["x"]]
//Example 3:
//
//Input: strs = [""]
//
//Output: [[""]]
public class P4 {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        int n = strs.length;
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> output = groupAnagrams(input);

        System.out.println(output);
    }
}
