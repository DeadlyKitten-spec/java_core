package HomeWork2;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {

    }

    public static boolean checkSum(int first, int second) {
        return (first + second) >= 10 && (first + second) <= 20;
    }

    public static void checkSigh(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean checkNegative(int number) {
        return number < 0;
    }

    public static void printLine(String line, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(line);
        }
    }

    public static boolean checkYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }
}
