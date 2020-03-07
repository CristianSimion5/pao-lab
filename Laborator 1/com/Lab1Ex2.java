package com;

import java.util.Scanner;

public class Lab1Ex2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.println("Dati 2 numere a si b:\na=");
        a = sc.nextInt();
        System.out.println("b=");
        b = sc.nextInt();
        
        System.out.println("Numarul mai mare este: ");
        if (a < b)
            System.out.println(b);
        else
            System.out.println(a);
        sc.close();
    }

}
