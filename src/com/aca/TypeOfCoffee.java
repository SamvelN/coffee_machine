package com.aca;

import java.util.Scanner;

public class TypeOfCoffee {
    public static void typeOfCoffee(int type, int amount) throws InterruptedException {
        switch (type) {
            case 1:
                espresso(amount);
                Reserve.setWater(Reserve.getWater() - amount * 250);
                Reserve.setCoffee(Reserve.getCoffee() - amount * 16);
                Reserve.setCups(Reserve.getCups() - amount);
                Reserve.setMoney(Reserve.getMoney() + amount * 4);
                break;
            case 2:
                latte(amount);
                Reserve.setWater(Reserve.getWater() - amount * 350);
                Reserve.setMilk(Reserve.getMilk() - amount * 75);
                Reserve.setCoffee(Reserve.getCoffee() - amount * 20);
                Reserve.setCups(Reserve.getCups() - amount);
                Reserve.setMoney(Reserve.getMoney() + amount * 7);
                break;
            case 3:
                cappuccino(amount);
                Reserve.setWater(Reserve.getWater() - amount * 200);
                Reserve.setMilk(Reserve.getMilk() - amount * 100);
                Reserve.setCoffee(Reserve.getCoffee() - amount * 12);
                Reserve.setCups(Reserve.getCups() - amount);
                Reserve.setMoney(Reserve.getMoney() + amount * 6);
                break;
        }
    }

    public static void espresso(int amount) throws InterruptedException {
        if (amount * new Ingredients().water_of_cappuccino > Reserve.getWater() ||
                amount * new Ingredients().milk_of_cappuccino > Reserve.getMilk() ||
                amount * new Ingredients().coffee_of_cappuccino > Reserve.getCoffee() ||
                amount > Reserve.getCups()) {
            System.out.println(Text.falseEspresso());
        } else {
            System.out.println(Text.trueCoffee());
            int money = amount * 4;
            System.out.println(">>С Вас " + money + "$<<");
            money = 0;
            while (money != amount * 4) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Пожалуйста, заплатите за кофе");
                money = scanner.nextInt();
            }
            for (int i = 0; i < amount; i++) {
                System.out.println("Please wait");
                Text.text();
                continue_(i, amount);
            }
        }
    }

    public static void latte(int amount) throws InterruptedException {
        if (amount * new Ingredients().water_of_latte > Reserve.getWater() ||
                amount * new Ingredients().milk_of_latte > Reserve.getMilk() ||
                amount * new Ingredients().coffee_of_latte > Reserve.getCoffee() ||
                amount > Reserve.getCups())
            System.out.println(Text.falseLatte());
        else {
            System.out.println(Text.trueCoffee());
            int money = amount * 7;
            System.out.println(">>С Вас " + money + "$<<");
            money = 0;
            while (money != amount * 7) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Пожалуйста, заплатите за кофе");
                money = scanner.nextInt();
            }
            for (int i = 0; i < amount; i++) {
                System.out.println("Please wait");
                Text.text();
                continue_(i, amount);
            }
        }
    }

    public static void cappuccino(int amount) throws InterruptedException {
        if (amount * new Ingredients().water_of_cappuccino > Reserve.getWater() ||
                amount * new Ingredients().milk_of_cappuccino > Reserve.getMilk() ||
                amount * new Ingredients().coffee_of_cappuccino > Reserve.getCoffee() ||
                amount > Reserve.getCups())
            System.out.println(Text.falseCappuccino());
        else {
            System.out.println(Text.trueCoffee());
            int money = amount * 6;
            System.out.println(">>С Вас " + money + "$<<");
            money = 0;
            while (money != amount * 6) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Пожалуйста, заплатите за кофе");
                money = scanner.nextInt();
            }
            for (int i = 0; i < amount; i++) {
                System.out.println("Please wait");
                Text.text();
                continue_(i, amount);
            }
        }
    }

    public static void continue_(int i, int amount) {
        byte enter = 1;
        if (i + 1 >= amount) {
            enter = 0;
            System.out.println("Пожалуйста заберите кофе");
        }
        while (enter != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, заберите кофе и наберите 0 для продолжения");
            enter = scanner.nextByte();
        }
    }
}
