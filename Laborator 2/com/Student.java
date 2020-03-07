package com;

public class Student {
    private String nume;
    private int nota;

    public Student(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
    }
    public int getNota() {
        return nota;
    }

    public String getNume() {
        return nume;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
