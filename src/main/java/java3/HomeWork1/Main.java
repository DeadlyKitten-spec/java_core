package java3.HomeWork1;

import java2.HomeWork1.App;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Task #1
        String[] array = {"aaa", "bbb", "ccc", "ddd"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        swapElements(array, scan.nextInt() - 1, scan.nextInt() - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Task #2
        List<String> myList = convertToList(array);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        //Task #3
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox1 = new Box();
        Box<Apple> appleBox2 = new Box();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();

        for (int i = 0; i < 10; i++) {
            appleBox1.add(new Apple());
        }
        for (int i = 0; i < 15; i++) {
            appleBox2.add(new Apple());
        }
        for (int i = 0; i < 20; i++) {
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 25; i++) {
            orangeBox2.add(new Orange());
        }

        System.out.println("Weight of the first box of apples: " + appleBox1.getWeight());
        System.out.println("Weight of the second box of apples: " + appleBox2.getWeight());
        System.out.println("Weight of the first box of oranges: " + orangeBox1.getWeight());
        System.out.println("Weight of the second box of oranges: " + orangeBox2.getWeight());

        appleBox1.sprinkle(appleBox2);
        orangeBox2.sprinkle(orangeBox1);

        System.out.println("Weight of the first box of apples: " + appleBox1.getWeight());
        System.out.println("Weight of the second box of apples: " + appleBox2.getWeight());
        System.out.println("Weight of the first box of oranges: " + orangeBox1.getWeight());
        System.out.println("Weight of the second box of oranges: " + orangeBox2.getWeight());
    }

    private static <T> void swapElements(T[] array, int first, int second){
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static <T> List<T> convertToList(T[] array){
        return Arrays.asList(array);
    }
}
