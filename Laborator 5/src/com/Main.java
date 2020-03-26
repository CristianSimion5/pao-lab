package com;

public class Main {
    public static void main(String[] args) {
        OutTask ot = new OutTask("Hello world!");
        ot.execute();

        RandomOutTask rot = new RandomOutTask();
        rot.execute();

        CounterOutTask cot = new CounterOutTask();
        cot.execute();
        cot.execute();
    }
}
