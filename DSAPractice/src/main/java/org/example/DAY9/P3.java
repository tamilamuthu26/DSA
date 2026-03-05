package org.example.DAY9;

//palindrome
public class P3 {

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {

        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
