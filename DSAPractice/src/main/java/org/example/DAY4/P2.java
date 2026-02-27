package org.example.DAY4;


//1.Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b to be a substring of a after repeating it, return -1.

//Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

//Input: a = "abcd", b = "cdabcdab"
//
//Output: 3
//Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.

//Input: a = "a", b = "aa"
//Output: 2
public class P2 {
    public static void main(String args[]){

        String a= "abcd";
        String b= "cdabcdab";


        System.out.println(process(a,b));
    }

    public static int process(String a, String b){

        int count =0;

        StringBuilder sb1 = new StringBuilder();

        while(sb1.length()<b.length()){
            sb1.append(a);
            count++;
        }

        if(sb1.toString().contains(b)){
            return count;
        }

        sb1.append(a);
        count++;
        if(sb1.toString().contains(b)){
            return count;
        }
        return -1;
    }
}
