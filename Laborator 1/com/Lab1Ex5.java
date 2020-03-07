package com;

import java.util.Scanner;

public class Lab1Ex5
{
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       
        System.out.println("Dati un numar n");
        n = sc.nextInt();
        sc.close();
        
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }

}