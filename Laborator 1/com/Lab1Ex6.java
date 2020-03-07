package com;

import java.util.Scanner;

public class Lab1Ex6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.println("Dati 2 numere a si b:\na=");
        a = sc.nextInt();
        System.out.println("b=");
        b = sc.nextInt();
        
        System.out.println("a^b = ");
   
        int prod = 1;
        for (int i = 0; i < b; i++) {
            prod *= a;
        }
        System.out.println(prod);
        sc.close();
    }

}
