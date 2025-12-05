package it.unical.demacs;

import java.util.HashMap;

public class Algorithms {

    /**
     * Sorts a given non-null array
     *
     * @param array to be ordered
     * @throws IllegalArgumentException if the input array is null
     */
    public void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        for (int i = 0; i < array.length - 1; i++) {
            // bubble the largest remaining element to the end
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Checks if two given strings are Anagrams (case-insensitive)
     *
     * @param first  the first string to compare
     * @param second the second string to compare
     * @return true if the two strings are anagrams
     * @throws IllegalArgumentException if one of the strings is null
     */
    public boolean areAnagrams(String first, String second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }

        String s1 = first.toLowerCase();
        String s2 = second.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            Integer cnt = charCount.get(c);
            if (cnt == null) {
                return false;
            }
            if (cnt == 1) {
                charCount.remove(c);
            } else {
                charCount.put(c, cnt - 1);
            }
        }

        return charCount.isEmpty();
    }
}
