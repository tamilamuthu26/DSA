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
        callLongestSubstring(s1);
        System.out.println("\n----------------"+"For Given String: "+s2+"----------------");
        callLongestSubstring(s2);
        System.out.println("\n----------------"+"For Given String: "+s3+"----------------");
        callLongestSubstring(s3);
    }
    public static String callLongestSubstring(String s){


        return " ";
    }
}
