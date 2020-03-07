package com;

public class Lab2Ex3 {
    public static void main(String[] args) {
        Copac c = new Copac(2, 3);

        System.out.println(c.getGrosime());
        System.out.println(c.getVarsta());

        c.creste();

        System.out.println("Dupa crestere");
        System.out.println(c.getGrosime());
        System.out.println(c.getVarsta());
    }
}