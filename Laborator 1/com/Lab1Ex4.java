package com;

import java.util.Scanner;

public class Lab1Ex4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       
        System.out.println("Dati un numar n");
        n = sc.nextInt();
  
        
        System.out.println(n + "!=");
        int prod = 1;
        for (int i = 2; i <= n; i++) {
            prod *= i;
        }
        
        System.out.println(prod);
        sc.close();
    }

}
