package com;

public class OutTask implements Task {
    private String mesaj;

    public OutTask(String mesaj) {
        this.mesaj = mesaj;
    }
    @Override
    public void execute() {
        System.out.println(this.mesaj);
    }
}
