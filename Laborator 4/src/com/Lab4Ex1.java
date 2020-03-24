package com;

import java.util.Arrays;

public class Lab4Ex1 {
    public static boolean check_anagrams(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "ramo";
        String s2 = "mora";

        if (check_anagrams(s1, s2)) {
            System.out.println("Cele 2 siruri sunt anagrame");
        }

        if (check_anagrams("abcde", "edcbb")) {
            System.out.println("Ok");
        }
        else {
            System.out.println("Not ok");
        }
    }
}
