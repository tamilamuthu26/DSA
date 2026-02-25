package org.example.DAY2;

import java.util.HashSet;
import java.util.Set;

//Longest Substring Without Repeating Characters
public class P4 {



        public static int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int n = s.length();

            int left = 0, right = 0;
            int maxLength = 0;

            while (right < n) {
                char ch = s.charAt(right);
                if (!set.contains(ch)) {
                    set.add(ch);
                    maxLength = Math.max(maxLength, right - left + 1);
                    right++;
                } else {
                    set.remove(s.charAt(left));
                    left++;
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {
            String s1 = "zxyzxyz";
            String s2 = "xxxx";

            System.out.println(lengthOfLongestSubstring(s1));
            System.out.println(lengthOfLongestSubstring(s2));
        }

}
