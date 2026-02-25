package org.example.DAY2;
//Valid Palindrome
//Solved
//        Easy
//Topics
//Company Tags
//Hints
//Given a string s, return true if it is a palindrome, otherwise return false.
//
//A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
//
//Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
//
//Example 1:
//
//Input: s = "Was it a car or a cat I saw?"
//
//Output: true
//Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

public class P1 {
        public static boolean isPalindrome(String s) {
            if (s == null) return false;

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }

                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

                if (Character.toLowerCase(s.charAt(left)) !=
                        Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }

        public static void main(String[] args) {
            String s1 = "Was it a car or a cat I saw?";
            String s2 = "tab a cat";

            System.out.println(isPalindrome(s1));
            System.out.println(isPalindrome(s2));
        }
}
