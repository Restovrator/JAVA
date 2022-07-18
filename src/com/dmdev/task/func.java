package com.dmdev.task;
// вывод наибольшего числа из двух
public class func {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 10;
        int result = GetMax (value2, value1);
        System.out.println(result);
    }
    public static int GetMax(int FirstValue, int SecondValue){
        if (FirstValue > SecondValue){
            return FirstValue;
        }
            return SecondValue;


    }
}
