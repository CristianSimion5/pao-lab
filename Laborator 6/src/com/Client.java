package com;

public class Client {
    String nume, prenume;
    int varsta;

    public Client(String linie) {
        String[] cuvinte = new String[3];
        cuvinte = linie.split(" ");
        nume = cuvinte[0];
        prenume = cuvinte[1];
        varsta = Integer.parseInt(cuvinte[2]);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " " + varsta;
    }
}
