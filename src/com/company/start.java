package com.company;

import java.util.*;

public class start {
    public static void main(String args[]){

        List<String> resultat = get("hej");
        for (String anagram: resultat
             ) {
            System.out.println(anagram);
        }
        System.out.println("Antal poster:" + resultat.size());
    }


    /**
     * Combination of recursion and one iterative approach to resolve this problem. The complexity of
     * this algorithm is O(N!) where N is the size of the input. In space terms the complexity order
     * is related to the number of permutations equals to O(N!) where N is the number of chars in the
     * input string.
     */
    public static List<String> get(String input) {
        List<String> result = null;
        if (input == null) {
            throw new IllegalArgumentException("You can't pass a null String as input.");
        } else if (input.isEmpty()) {
            result = new LinkedList<String>();
        } else {
            result = getAnagramsInner("", input);
        }
        return result;
    }


    private static List<String> getAnagramsInner(String prefix, String word) {
        List<String> anagrams = new LinkedList<String>();
        int n = word.length();
        if (n == 0) {
            anagrams.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                //Add the old prefix the new letter
                String newPrefix = prefix + word.charAt(i);
                //Skip the current letter for the next word
                String newWord = word.substring(0, i) + word.substring(i + 1, n);
                anagrams.addAll(getAnagramsInner(newPrefix, newWord));
            }
        }
        return anagrams;
    }

}