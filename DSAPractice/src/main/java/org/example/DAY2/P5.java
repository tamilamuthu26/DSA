package org.example.DAY2;

//Longest Repeating Character Replacement
public class P5 {

        public static int characterReplacement(String s, int k) {
            int n = s.length();

            int left = 0;
            int maxLength = 0, maxFreq = 0;

            int[] freq = new int[26];

            for (int right = 0; right < n; right++) {
                int idx = s.charAt(right) - 'A';
                freq[idx]++;
                maxFreq = Math.max(maxFreq, freq[idx]);

                while ((right - left + 1) - maxFreq > k) {
                    freq[s.charAt(left) - 'A']--;
                    left++;
                }

                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }

        public static void main(String[] args) {
            String s1 = "ABAB";
            int k1 = 2;

            String s2 = "AABABBA";
            int k2 = 1;

            System.out.println(characterReplacement(s1, k1));
            System.out.println(characterReplacement(s2, k2));
        }

}
