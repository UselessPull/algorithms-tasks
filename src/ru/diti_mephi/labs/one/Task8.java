package ru.diti_mephi.labs.one;

public class Task8 {
    public static void main(String[] args) {
        int[] array;
        int maxIndex = 0;
        array = new int[21];
        //Заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 22));
            System.out.print(array[i] + " ");
            //Max Numbers Array
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        System.out.println(" ");
        System.out.println("Max Index Array = " + array[maxIndex]);
    }
}
