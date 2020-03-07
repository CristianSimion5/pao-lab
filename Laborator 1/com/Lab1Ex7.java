package com;

import java.util.Scanner;

public class Lab1Ex7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       
        System.out.println("Dati un numar natural n");
        n = sc.nextInt();
        sc.close();
        
        if (n <= 0) {
            System.out.println("n invalid");
            return;
        }
        
        System.out.println("Al " + n + "-lea termen din seria Fibonacci este:");
        int n1 = 0, n2 = 1;
        if (n == 1) {
            System.out.println(n1);
            return;
        }
        else if (n == 2) {
            System.out.println(n2);
            return;
        }
        
        int aux;
        for (int i = 3; i <= n; i++) {
            aux = n2;
            n2 = n1 + n2;
            n1 = aux;
        }
        
        System.out.println(n2);
    }

}