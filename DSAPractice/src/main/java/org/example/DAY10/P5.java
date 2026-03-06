package org.example.DAY10;

//Count the number of vowels in a string.
public class P5 {
    public static int countVowels(String str) {

        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        int count = 0;

        for (char c : str.toLowerCase().toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u') {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countVowels("programming"));
    }
}
