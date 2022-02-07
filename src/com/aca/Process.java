package com.aca;

import java.util.Scanner;

public class Process {

    public static void main(String[] args) throws InterruptedException {
        Process.process();
    }


    public static void process() throws InterruptedException {
        int variant = variant();
        switch (variant) {
            case 1:
                int type = type();
                int amount = amount();
                TypeOfCoffee.typeOfCoffee(type, amount);
                break;
            case 2:
                if (Fill.password()) {
                    System.out.println(Text.fill());
                    Text.end();
                    Reserve.setWater(10000);
                    Reserve.setMilk(5000);
                    Reserve.setCoffee(2500);
                    Reserve.setCups(50);
                }
                break;
            case 3:
                if (Fill.password()) {
                    System.out.println(Text.take());
                    Text.end();
                    Reserve.setMoney(0);
                }
                break;
        }
        process();
    }


    public static int variant() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, select an option (Select the number)\n 1. buy\n 2. fill \n 3. take\n > ");
        return scanner.nextInt();
    }

    public static int type() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, select the type of coffee (Select the number)\n" +
                " 1. espresso 4$\n 2. latte 7$\n 3. cappuccino 6$\n > ");
        return scanner.nextInt();
    }

    public static int amount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need:\n > ");
        return sc.nextInt();
    }


}
