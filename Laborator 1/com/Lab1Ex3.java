package com;

import java.util.Scanner;

public class Lab1Ex3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       
        System.out.println("Dati un numar n");
        n = sc.nextInt();
  
        
        System.out.println("Divizorii lui " + n + " sunt:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
        sc.close();
    }

}
