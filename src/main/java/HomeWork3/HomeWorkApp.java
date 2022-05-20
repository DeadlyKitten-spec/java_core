package HomeWork3;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }

    public static int[] arrayReverse() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] arrayHundredElements() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] arrayLessSixWillDouble() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    public static int[][] diagonals(int size){
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) || (i + j == size - 1)) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    public static int[] arrayForTask(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void maxAndMin() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент = " + max + " " + "Минимальный элемент = " + min);
    }

    public static boolean checkBalance(int[] array) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            rightSum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            rightSum -= array[i];
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
        /*
        Была идея еще, проходится по массиву и у каждого элемента делать проверку слева(включая сам элемент) и справа.
        Тоесть прохоидится двумя циклами в два направления и считать сумму, потом так же в if их сравнивать. Но я
        подумал так будет не совсем эффективно, асимптотика больше.
         */
    }

    public static int[] shiftArray(int[] array, int n) {
        //n = n % array.length;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int temp = array[0];
                array[0] = array[array.length - 1];
                for (int j = 1; j < array.length - 1; j++) {
                    array[array.length - j] = array[array.length - j - 1];
                }
                array[1] = temp;
            }
        }else{
            for (int i = 0; i > n; i--) {
                int temp = array[array.length - 1];
                array[array.length - 1] = array[0];
                for (int j = 1; j < array.length - 1; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 2] = temp;
            }
        }
        return array;
        /*
        Не придумал ничего умнее, чем n раз делать сдвиг на + или - 1
         */
    }
}
