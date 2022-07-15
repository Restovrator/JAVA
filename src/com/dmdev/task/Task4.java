package com.dmdev.task;

public class Task4 {

    public static void main(String[] args) {
        int year = 1900;
        if (year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)){
            System.out.println(year + " Високосный");
        } else{
            System.out.println(year + " Не Високосный");
        }
    }
}
