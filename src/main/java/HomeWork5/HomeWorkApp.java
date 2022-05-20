package HomeWork5;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите данные о сотруднике № " + (i + 1) + " в формате ФИО, должность, email, телефон, зарплата, возраст:");
            employees[i] = new Employee(scan.next(), scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
            System.out.println("Сотрудник с именем " + employees[i].SNP + " добавлен");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age >= 40) {
                System.out.println(employees[i].toString());
            }
        }
    }
}
