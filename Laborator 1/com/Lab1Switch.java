package com;

import java.util.Scanner;

public class Lab1Switch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zi = sc.nextLine();
       
        sc.close();
        
        switch(zi) {
            case "Luni":
                System.out.println("Luni e ziua in care incepe munca");
                break;
            case "Marti":
                System.out.println("Marti e a doua zi din saptamana");
                break;
            case "Miercuri":
                System.out.println("Miercuri e in mijlocul saptamanii");
                break;
            case "Joi":
                System.out.println("Joi asteptam vineri");
                break;
            case "Vineri":
                System.out.println("Vineri se termina munca ");
                break;
            case "Sambata":
                System.out.println("Sambata face parte din weekend");
                break;
            case "Duminica":
                System.out.println("Duminica marcheaza sfarsitul saptamanii");
                break;
            default:
                System.out.println("Ai introdus o zi pe care nu o inteleg");
                break;
        }
    }
}
