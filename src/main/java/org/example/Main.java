package org.example;

public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int replenishment = 1100;

       int bonus = 0;
        if (replenishment > 1000){
            bonus = replenishment/100;
        }
        int sum = amount + replenishment+ bonus;
        System.out.println("Ваш счет " + sum);
        System.out.println("Ваши бонусы " + bonus + " rub");
    }
}