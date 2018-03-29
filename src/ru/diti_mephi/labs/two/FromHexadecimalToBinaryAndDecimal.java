package ru.diti_mephi.labs.two;

import java.util.ArrayList;
import java.util.List;

public class FromHexadecimalToBinaryAndDecimal extends BinaryToOctalAndHexadecimal {

    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("1AF0121");
        listA.add("1931C81");
        listA.add("15441A2 ");
        listA.add("2A54656");
        listA.add("A01C1F ");
        listA.add("31F1504");
        listA.add("B11001");
        listA.add("6801FA");

        for (String aListA : listA) {
            System.out.println("otvet = " + new BinaryToOctalAndHexadecimal().numeralSystem( aListA, 16, 2));
            System.out.println("otvet = " + new BinaryToOctalAndHexadecimal().numeralSystem( aListA, 16, 10));
            System.out.println(" ");
        }
    }
}
