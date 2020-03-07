package com;

import java.util.Scanner;

public class Lab1Ex1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dati un numar natural n: ");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i + " ");
        }
        
        sc.close();
    }

}