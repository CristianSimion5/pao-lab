package com;

public class CounterOutTask implements Task {
    public static int contor = 0;

    @Override
    public void execute() {
        contor++;
        System.out.println("Valoare contor dupa incrementare: " + contor);
    }
}
