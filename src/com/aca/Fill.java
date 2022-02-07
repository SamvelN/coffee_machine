package com.aca;

import java.util.Scanner;

public class Fill {
    public static boolean password() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста введите парроль");
        int password = sc.nextInt();
        return password == 1234;
    }
}
