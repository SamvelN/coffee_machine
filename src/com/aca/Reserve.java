package com.aca;

public class Reserve {
    private static int water = 10000;
    private static int milk = 5000;
    private static int coffee = 2500;
    private static int cups = 50;
    private static int money = 0;

    public static int getWater() { return water; }

    public static void setWater(int water) {
        Reserve.water = water;
    }

    public static int getMilk() { return milk; }

    public static void setMilk(int milk) {
        Reserve.milk = milk;
    }

    public static int getCoffee() {
        return coffee;
    }

    public static void setCoffee(int coffee) {
        Reserve.coffee = coffee;
    }

    public static int getCups() {
        return cups;
    }

    public static void setCups(int cups) {
        Reserve.cups = cups;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Reserve.money = money;
    }
}

