package com.dmdev.WhileExample.Task;

public class task3 {
    public static void main(String[] args) {
        double sourceSum = 35;
        double result = sum(sourceSum);
        System.out.println(result);

    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int i = 1626; i < 2022; i++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(i + ":" + result);

        }
        return result;
    }
}
