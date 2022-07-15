package com.dmdev.func;

public class lesson_func {
    //Определение fun. [Модификаторы] - Возвр. тип - название - скобки( параметры)
    public static void main(String[] args) {
        int value = 1900;
        isLeapYear(value);

    }
    public static void isLeapYear(int year){
        if (year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)){
            System.out.println(year + " Високосный");
        } else{
            System.out.println(year + " Не Високосный");
        }
    }
}
