package ru.diti_mephi.labs.two;

import java.util.ArrayList;
import java.util.List;

public class BinaryToOctalAndHexadecimal {

    final String SYMBOL = "0123456789ABCDEF";

    String output, numberOne;

    int sum;

    private int valueUpper(String p) {
        return SYMBOL.indexOf(p.toUpperCase());
    }

    private int step (int numeralSystem, int st) {
        int result = 1;
        if (st == 0) {
            return 1;
        } else {
            for (int i = 1; i <= Math.abs(st); i++) {
                result *= numeralSystem;
                System.out.println(result);
            }
        }
        return result;
    }

    public String numeralSystem (String number, int from, int to) {
        output = "";

        numberOne = number;

        if (from < 2 || from > 16 || to < 2) return "ERROR";
        if (from == to) return number;
        else {
            if (to == 10) {
                sum = step(from, (numberOne.length() - 1));

                for (int i = numberOne.length() - 2; i >= 0; i--) {
                    sum += (valueUpper(numberOne.substring(numberOne.length()-i-1, numberOne.length() - i)) * step(from, i));
                    System.out.println(sum);
                }
                return "" + sum;
            }
            if ( from == 10) {
                int numberTwo = Integer.parseInt(numberOne);
                if (numberTwo != 0) {
                    do{
                        output = SYMBOL.charAt((numberTwo - (numberTwo / to) * to)) + output;
                        numberTwo = (numberTwo / to);
                    } while (numberTwo > 0);

                }
                return output;
            }
            else {
                return numeralSystem(numeralSystem(number, from,10),10,to);
            }
        }
    }

    public static void main(String[] args){
        List<String> listA = new ArrayList<>();
        listA.add("111000111");
        listA.add("111010101");
        listA.add("111111101");
        listA.add("101001101");
        listA.add("111011101");
        listA.add("100001110");
        listA.add("111010101");
        listA.add("1000111111");
        listA.add("1011110101");
        listA.add("1101110111");

        for (String aListA : listA) {
            System.out.println("Output Form Binary to Octal = " + new BinaryToOctalAndHexadecimal().numeralSystem( aListA, 2, 8));
            //System.out.println("Output Form Binary to Hexadecimal = " + new BinaryToOctalAndHexadecimal().numeralSystem( aListA, 2, 16));
            //System.out.println("Output Form Binary to Decimal = " + new BinaryToOctalAndHexadecimal().numeralSystem( aListA, 2, 10));
            System.out.println(" ");
        }
    }
}
