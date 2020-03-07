package com;

import java.util.Scanner;

public class Lab2Ex1
{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int v[] = new int[1000];
       int i = 0;
       
       while (true) {
           v[i] = in.nextInt();
           if (v[i] == -1) {
               break;
            }
           i++;
       }
       in.close();
       
       int suma = 0;
       for (int j = 0; j < i; j++) {
           suma += v[j];
       }
       
       System.out.println(suma / (double )i);
    }
}
