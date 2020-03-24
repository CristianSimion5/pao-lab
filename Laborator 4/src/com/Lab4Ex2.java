package com;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4Ex2 {
    public static boolean check_palindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s_rev = sb.reverse().toString();
        return s.equals(s_rev);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String[] a = new String[n];
       String[] b = new String[n];
       String pal_max;
       int n_pal = 0;
       sc.nextLine();

       for (int i = 0; i < n; i++) {
           a[i] = sc.nextLine();
       }

        for (int i = 0; i < n; i++) {
            if (check_palindrome(a[i])) {
                b[n_pal] = a[i];
                n_pal++;
            }
        }

        if (n_pal == 0) {
            System.out.println("Nu exista palindroame");
            return;
        }

        pal_max = b[0];
        for (int i = 1; i < n_pal; i++) {
            if (b[i].length() > pal_max.length()) {
                pal_max = b[i];
            }
        }

        System.out.println("Palindromul de lungime maxima este " + pal_max);
    }
}
