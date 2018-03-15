package ru.diti_mephi.labs.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task2 {
    public static void main(String[] args) throws IOException {
        double y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число: ");
        double x = Double.parseDouble(reader.readLine());

        if (x > 1) {
            y = Math.pow(x, 2) + 4 * x + 5;
            System.out.println("Output = " + y);
        } else if (x <= -1) {
            y = (1 / ((Math.pow(x, 2) + 4 * x + 5)));
            System.out.println("Output = " + y);
        }
    }
}