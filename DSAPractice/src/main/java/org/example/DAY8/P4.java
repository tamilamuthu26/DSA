package org.example.DAY8;

//Count how many times a character appears in a string.
//
//Example:
//Input: "programming", 'g' → Output: 2
public class P4 {
    public static void main(String[] args) {

        String input = "programming";
        char target = 'g';

        int result = countFrequency(input, target);

        System.out.println("Frequency of '" + target + "': " + result);
    }

    public static int countFrequency(String str, char target) {

        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}
