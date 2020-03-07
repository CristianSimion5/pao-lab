package com2;

public class Copac {
    private double grosime;
    private int varsta;

    public Copac(double g, int v) {
        this.grosime = g;
        this.varsta = v;
    }

    public double getGrosime() {
        return grosime;
    }

    public void setGrosime(double grosime) {
        this.grosime = grosime;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void creste() {
        varsta++;
        grosime += 1.5;
    }
}