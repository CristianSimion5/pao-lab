package com;

import java.util.Scanner;

public class Lab2Ex2
{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int x[] = new int[n], y[] = new int[n];
       int nr, xi = 0, yi = 0;
       
       for (int i = 0; i < n; i++) {
            nr = in.nextInt();
            if (nr % 2 == 1) {
                x[xi] = nr;
                xi++;
            }
            else {
                y[yi] = nr;
                yi++;
            }
        }
        in.close();
           
        System.out.println("Lungimea lui x este " + xi);
        System.out.println("Lungimea lui y este " + yi);
        
        if (xi > yi) {
            System.out.println("x are lungimea mai mare");
        }
        else {
            System.out.println("y are lungimea mai mare");
        }
    } 
}
