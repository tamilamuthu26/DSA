package org.example.DAY7;

//find the longest substring

//Q. Return the start index and length of the longest substring having identical characters in a given String.
//i/p : S = "aabbbbbccddb"
//o/p: [2,5]
//explaination : As longest substring is 'bbbbb' of length 5 and start index as 2
//i/p: S = "aabbb22rrrrr345571111111"
//o/p: [17,7]
//explaination : As '1111111' is the longest substring of length 7 and start index =17
//
//I used sliding window to solve this. Please comment for the solution.
public class P5 {
    public static void main(String[] args){
        String s1 = "aabbbbbccddb";
        String s2 = "aabbb22rrrrr345571111111";
        String s3 = "aaaabbeedddd";
        System.out.println("\n----------------"+"For Given String: "+s1+"----------------");
        System.out.println(callLongestSubstring(s1));
        System.out.println("\n----------------"+"For Given String: "+s2+"----------------");
        System.out.println(callLongestSubstring(s2));
        System.out.println("\n----------------"+"For Given String: "+s3+"----------------");
        System.out.println(callLongestSubstring(s3));
    }
    public static String callLongestSubstring(String s){


        if (s == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        if (s.isEmpty()) {
            return "[0,0]";
        }

        int maxStart = 0;
        int maxLength = 1;

        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {

                // Compare with max before resetting
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = currentStart;
                }

                // Reset for new streak
                currentStart = i;
                currentLength = 1;
            }
        }

        // Final comparison (important for last streak)
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStart = currentStart;
        }

        return "[" + maxStart + "," + maxLength + "]";
    }
}
