package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2  {
    public static int checkUP(String user, String pass, ArrayList<String> u, ArrayList<String> p) {
        boolean userFound = false;
        for (int i = 0; i < u.size(); i++) {
            if (user.equals(u.get(i))) {
                userFound = true;
                if (pass.equals(p.get(i)))
                    return 1;
            }
        }
        if (userFound)
            return 0;
        return -1;
    }

    public static void main(String[] args) throws IOException {
        try(FileInputStream fin = new FileInputStream("parole.txt")) {
            ArrayList<String> users = new ArrayList<>(), passwords = new ArrayList<>();
            StringBuilder aux = new StringBuilder();
            int size = fin.available();
            byte[] text = new byte[size];
            text = fin.readAllBytes();
            for (byte b : text) {
                if (b == 32) {              // space
                    users.add(aux.toString());
                    aux.setLength(0);
                }
                else if (b == 13) {         // newline
                    passwords.add(aux.toString());
                    aux.setLength(0);
                }
                else if (b == 10) {         // carriage return
                    continue;
                }
                else {
                    aux.append((char) b);
                }
            }
            passwords.add(aux.toString());

            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i) + " " + passwords.get(i));
            }

            Scanner sc = new Scanner(System.in);

            int limita = 5;
            while (limita-- > 0) {
                System.out.println("Introduceti numele");
                String username = sc.nextLine();
                System.out.println("Introduceti parola");
                String password = sc.nextLine();

                switch (checkUP(username, password, users, passwords)) {
                    case 1:
                        System.out.println("acces permis");
                        return;
                    case 0:
                        System.out.println("parola gresita");
                        int incercari = 3;
                        while (incercari-- > 0) {
                            System.out.println("Introduceti parola din nou");
                            System.out.println("Mai aveti " + (incercari + 1) + " incercari");
                            password = sc.nextLine();
                            for (String p: passwords) {
                                if (p.equals(password)) {
                                    System.out.println("acces permis");
                                    return;
                                }
                            }
                        }
                        System.out.println("cont blocat");
                        return;
                    case -1:
                        System.out.println("Date de intrare gresite");
                        System.out.println("Mai aveti " + (limita + 1) + " incercari");
                        break;
                }
            }
            System.out.println("Nu ai cont. Inregistreaza-te");
        }
    }
}
