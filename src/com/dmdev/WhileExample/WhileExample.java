package com.dmdev.WhileExample;

public class WhileExample {
    public static void main(String[] args) {
        int value = 0;
        //цикл с пост условием
        do {
            System.out.println(value);
            value++; //+1
        } while (value < 10);
    }
    //ктрл+алт+м вынос в функцию
    private static void whileExample() {
        int value = 10;
        while (value > 0){
            System.out.println(value);
            value --;  //декремент уменьшение на единицу
        }
    }
}
