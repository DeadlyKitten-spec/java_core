package HomeWork7;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            System.out.print("Enter name of kitten: ");
            String name = scan.nextLine();
            System.out.print("Enter how much the kitten likes to eat: ");
            int appetite = scan.nextInt();
            scan.nextLine();
            cats[i] = new Cat(name, appetite);
        }
        Plate p1 = new Plate(50);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(p1);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].isSatiety());
        }
    }
}
