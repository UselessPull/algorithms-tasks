package ru.diti_mephi.labs.one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое целое положительное число: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите второе целое положительное число: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.print("Наибольший общий делитель: " + commonDivider(a, b));
    }

    public static int commonDivider (int a, int b) {
        int commonDivider = 1;

        for (int i = 1; i < (a < b ? a : b); i++) {
            if ( (a % i == 0) && (b % i == 0) )
                commonDivider = i;
        }
        return commonDivider;
    }
}