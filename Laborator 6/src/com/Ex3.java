package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader fin = new BufferedReader(new FileReader("clienti.txt"))) {
            ArrayList<Client> listaClienti = new ArrayList<>();
            String linie = fin.readLine();
            while (linie != null) {
                listaClienti.add(new Client(linie));
                linie = fin.readLine();
            }

            System.out.println("Magazinul are " + listaClienti.size() + " clienti");
            System.out.println("Clienti majori:");
            int majori = 0;
            for (Client c : listaClienti) {
                if (c.getVarsta() >= 18) {
                    System.out.println(c);
                    majori++;
                }
            }

            System.out.println("Numarul de clienti minori este " + (listaClienti.size() - majori));
        }
    }
}
