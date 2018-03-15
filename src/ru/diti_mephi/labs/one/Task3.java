package ru.diti_mephi.labs.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        double y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите целое положительное число: ");
        double x = Double.parseDouble(reader.readLine());

        if (x <= -2) {
            y = (1 / (Math.pow(x, 3)));
            System.out.println("Output = " + y);
        } else if ((-2 < x) && (x < 0)) {
            y = Math.pow(x, 3 / 4);
            System.out.println("Output = " + y);
        } else if( x >= 0) {
            y = Math.sqrt(6 * x + 4);
            System.out.println("Output = " + y);
        }
    }
}