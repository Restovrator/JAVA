package com.dmdev.task;
/*есть сумма в рублях и системно посдатвить рубль в склонении к данному числу.*/
public class Task3 {
    public static void main(String[] args) {
        int rubles = 11;
        if (rubles % 10 ==1 && rubles %100 !=11)
        {
            System.out.println(rubles + " Рубль");
        } else if ((rubles % 10 ==2 || rubles % 10 ==3 || rubles %10 == 4)
                && !(rubles % 100 ==12 || rubles % 100 ==13 || rubles %100 == 14)){
            System.out.println(rubles + " Рубля");
        } else {
            System.out.println((rubles + " Рублей"));
        }

    }
}
