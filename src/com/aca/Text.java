package com.aca;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Text {

    public static String falseEspresso() {
        return ("No, I can make only "
                + Math.min(Math.min(Reserve.getWater() / new Ingredients().water_of_espresso, Reserve.getCups()),
                Reserve.getCoffee() / new Ingredients().coffee_of_espresso)
                + "cup(s) of Espresso");
    }

    public static String falseLatte() {
        return ("No, I can make only "
                + Math.min(Math.min((Reserve.getWater() / new Ingredients().water_of_latte),
                        (Reserve.getMilk() / new Ingredients().milk_of_latte)),
                Math.min(Reserve.getCoffee() / new Ingredients().coffee_of_latte, Reserve.getCups()))
                + "cup(s) of Latte");
    }

    public static String falseCappuccino() {
        return ("No, I can make only "
                + Math.min(Math.min((Reserve.getWater() / new Ingredients().water_of_cappuccino),
                        (Reserve.getMilk() / new Ingredients().milk_of_cappuccino)),
                Math.min(Reserve.getCoffee() / new Ingredients().coffee_of_cappuccino, Reserve.getCups()))
                + "cup(s) of Cappuccino");
    }

    public static String trueCoffee() {
        return ("Yes, I can make that amount of coffee");
    }

    public static String fill() {
        return ("Please, fill in the following amount of ingredients:\n" +
                "water: " + (10000 - Reserve.getWater()) + "\n" +
                "milk: " + (5000 - Reserve.getMilk()) + "\n" +
                "coffee: " + (2500 - Reserve.getCoffee()) + "\n" +
                "cups: " + (50 - Reserve.getCups()) + "\n");
    }

    public static void end() {
        byte enter = 1;
        while (enter != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("После завершения нажмите 0");
            enter = scanner.nextByte();
        }
    }

    public static String take() {
        return ("I have " + Reserve.getMoney() + " dollars");
    }

    public static void text() throws InterruptedException {
        System.out.println("> Starting to make a coffee");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("> Grinding coffee beans");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("> Boiling water");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("> Mixing boiled water with crushed coffee beans");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("> Pouring coffee into the cup");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("> Pouring some milk into the cup");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("> COFFEE IS READY!!!");
    }
}
