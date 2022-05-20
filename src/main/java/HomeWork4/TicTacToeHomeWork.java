package HomeWork4;

import java.util.Random;
import java.util.Scanner;


public class TicTacToeHomeWork {
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '.';

    public static final Scanner scan = new Scanner(System.in);
    public static final Random rand = new Random();

    public static char[][] map;
    public static final int SIZE = 3;

    public static void main(String[] args) {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (!checkWin(DOT_X) && !isFieldFull()) {
                AITurn();
                printField();
                if (checkWin(DOT_O) || isFieldFull()) {
                    if (checkWin(DOT_O)) {
                        System.out.println("Победил компьютер");
                        break;
                    }
                    if (isFieldFull()) {
                        System.out.println("Ничья!");
                        break;
                    }
                }
            } else {
                if (checkWin(DOT_X)) {
                    System.out.println("Вы победили!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Ничья!");
                }
            }
        }
    }

    public static void initField() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printField() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) {
        if ((x >= 1 && x <= 3) && (y >= 1 && y <= 3)) {
            if (map[x - 1][y - 1] == DOT_EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static void humanTurn() {
        while (true) {
            System.out.println("Введите координаты: ");
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (isCellValid(x, y)) {
                map[x - 1][y - 1] = DOT_X;
                break;
            }
        }
    }

    public static void AITurn() {
        while (true) {
            int x = rand.nextInt(SIZE);
            int y = rand.nextInt(SIZE);
            if (isCellValid(x + 1, y + 1)) {
                map[x][y] = DOT_O;
                System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
                break;
            }
        }
    }

    public static boolean checkWin(char dot) {
        int counterVertical = 0;
        int counterHorizontal = 0;
        int counterDiagonalMain = 0;
        int counterDiagonalPob = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    counterHorizontal++;
                }
            }
            if (counterHorizontal == 3) {
                return true;
            }
            counterHorizontal = 0;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == dot) {
                    counterVertical++;
                }
            }
            if (counterVertical == 3) {
                return true;
            }
            counterVertical = 0;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((i == j) && (map[i][j] == dot)) {
                    counterDiagonalMain++;
                }
                if (((i + j) == (SIZE - 1)) && (map[i][j] == dot)) {
                    counterDiagonalPob++;
                }
            }
        }
        if (counterDiagonalMain == 3 || counterDiagonalPob == 3) {
            return true;
        }
        return false;
    }

    public static boolean isFieldFull() {
        int counter = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    counter++;
                }
            }
        }
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }
}