package com;

public class RandomOutTask implements Task {
    private double rand_num;

    public RandomOutTask() {
        this.rand_num = Math.random();
    }
    @Override
    public void execute() {
        System.out.println(rand_num);
    }
}
