package Lesson07.online;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.02.2022
 */

public class Lesson07 extends Object{

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        String string1 = "Hello!";
//        String string2 = "Hel";
//        string2 += "lo!";
//
//        String string3 = scanner.nextLine(); //Hello!
//        String string4 = "Hello!";
//
//        System.out.println("string1 > " + string1);
//        System.out.println("string2 > " + string2);
//        System.out.println("string3 > " + string3);
//        System.out.println("string4 > " + string4);
//        System.out.println("**********");
//        System.out.println("string1 == string2 > " + (string1 == string2));
//        System.out.println("string1 == string3 > " + (string1 == string3));
//        System.out.println("string1 == string4 > " + (string1 == string4));
//        System.out.println("**********");
//        System.out.println("string1 == string2 > " + (string1.equals(string2)));
//        System.out.println("string1 == string3 > " + (string1.equals(string3)));
//        System.out.println("string1 == string4 > " + (string1.equals(string4)));

        String test1 = "Test";
        StringBuilder stringBuilder = new StringBuilder("Test");

        long startTime = System.nanoTime();  //Hex-format

        for (int i = 0; i < 50000; i++) {
            test1 += i; // "Test0123456789 .. 49999"
        }

        float endTime = System.nanoTime() - startTime;

        System.out.println(test1);
        System.out.println("Time test1-string = " + (endTime * 0.000001f) + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(i); // "Test0123456789 .. 49999"
        }

        endTime = System.nanoTime() - startTime;

        System.out.println(stringBuilder.toString());
        System.out.println(test1.equals(stringBuilder.toString()));
        System.out.println("Time test-stringBuilder = " + (endTime * 0.000001f) + " millisec.");
    }
}
