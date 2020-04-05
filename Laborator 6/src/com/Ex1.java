package com;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fout = new FileWriter("numere.txt");
        double nr1, nr2;

        System.out.println("Dati numarul de perechi pe care vreti sa le introduceti:");
        int n = sc.nextInt();
        while (n-- > 0) {
            nr1 = sc.nextDouble();
            nr2 = sc.nextDouble();

            try {
                if (nr1 >= nr2) {
                    throw new Exception("Cele 2 numere nu respecta proprietatea data");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Dati alte 2 numere:");
                nr1 = sc.nextDouble();
                nr2 = sc.nextDouble();
            }
            finally {
                if (nr1 < nr2) {
                    fout.write(Double.toString(nr1) + ' ' + Double.toString(nr2) + '\n');
                }
            }
        }
        fout.close();
    }
}
