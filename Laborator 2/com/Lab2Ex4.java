package com;

import java.util.Scanner;

public class Lab2Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, nota;

        String[] linie = new String[2];
        String nume;

        n = Integer.parseInt(in.nextLine());
        Student[] studenti = new Student[n];

        for (int i = 0; i < n; i++) {
            linie = in.nextLine().split(" ");
            nume = linie[0];
            nota = Integer.parseInt(linie[1]);
            studenti[i] = new Student(nume, nota);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(studenti[i].getNume() + " " + studenti[i].getNota());
        }
    }
}
