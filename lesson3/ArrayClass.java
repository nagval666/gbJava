package Lesson03.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 19.01.2022
 */

public class ArrayClass {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            randomAnyValue(20,-20);
//        }

//        studyRandom();

//        String tmp = studyScannerString("Enter your name","Welcome");
//        System.out.println(tmp);
//        System.out.println("********");
//        System.out.println(studyScannerString("Enter your phone", "Your phone is"));
//        studyScannerNumberInt();

//        studyOneSizeArray();
//        universalStudy2Arrays(60,5);
//        studyTwoSizeArray();
        
//        int[][][][][] array5 = new int[5][][][][];
//
//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//                for (int k = 0; k < ; k++) {
//                    for (int l = 0; l < ; l++) {
//                        for (int m = 0; m < ; m++) {
//
//                        }
//                    }
//                }
//            }
//        }

        welcome("Boris", "Qwerty");

    }

    public static void welcome(String username) {
        System.out.println("Hello " + username);
    }

    public static void welcome(String username, int age) {
        System.out.println("Hello " + username);
    }

    public static void welcome(int age, String username) {
        System.out.println("Hello " + username);
    }

    public static void welcome(String username, String surname) {
        System.out.println("Hello " + username + " " +surname);
    }

    public static void welcome(String username, String surname, int age) {
        System.out.println("Hello " + username + " " +surname + " Age : " + age);
    }

    public static void universalStudy2Arrays(int height, int width) {
        String[][] arr = new String[height][width];

        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                arr[y][x] = "[" + y + ":" + x + "]";
            }
        }

        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + "\t");
            }
            System.out.println();
        }
    }

    public static void studyTwoSizeArray() {
        int[][] myArray = new int[5][];
        myArray[0] = new int[2];
        myArray[1] = new int[4];
        myArray[2] = new int[6];
        myArray[3] = new int[8];
        myArray[4] = new int[10];

        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void studyOneSizeArray() {
        int[] myArrayInt = new int[5];
        myArrayInt[0] = 6;
        myArrayInt[1] = -20;
        myArrayInt[2] = 0;
        myArrayInt[3] = 12;
        myArrayInt[4] = 15;

        System.out.println(myArrayInt[4]);

        String[] myArrayString = new String[500];

        for (int i = 0; i < myArrayString.length; i++) {
            myArrayString[i] = "String " + (i + 1);
        }


        for (int i = 0; i < myArrayString.length; i++) {
            System.out.print(myArrayString[i] + " | ");
        }
        System.out.println(myArrayString[324]);

        String[] arrayA = {"A", "B", "C", "d"};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }

    public static void studyRandom() {
        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextInt()); //[-int; +int]
            System.out.print(random.nextInt(30) + " | "); //[0; value)
//            System.out.print(random.nextFloat() + " | "); //[0;1)
//            System.out.print(random.nextDouble() + " | "); //[0;1)
        }
    }

    public static String studyScannerString(String systemMsg, String welcomeMsg) {
        System.out.print(systemMsg + " > ");
        return welcomeMsg + " " + scanner.next();
    }

    public static void studyScannerNumberInt() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
    }

    public static void randomAnyValue(int min, int max) {
        if (max > min) {
            int value = max - min;
            System.out.println(min + random.nextInt(value + 1));
        } else {
            System.out.println("Incorrect data");
        }
    }
}
