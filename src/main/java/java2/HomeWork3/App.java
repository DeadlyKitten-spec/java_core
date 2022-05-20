package java2.HomeWork3;

import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        //firstTask();
        //secondTask();
    }

    private static void secondTask() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("+21312", "Petrov");
        phonebook.add("+45454", "Ivanov");
        phonebook.add("+56789", "Petrov");
        phonebook.get("Petrov");
        phonebook.get("Smirnov");
    }

    private static void firstTask() {
        ArrayList<String> array = new ArrayList<>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");
        array.add("f");
        array.add("c");
        array.add("d");
        array.add("g");
        array.add("h");
        array.add("d");
        array.add("g");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < array.size(); i++) {
            set.add(array.get(i));
        }
        System.out.println("Unique elements: " + set);
        for (String i : set) {
            int count = 0;
            for (int j = 0; j < array.size(); j++) {
                if (array.get(j).equals(i)) {
                    count++;
                }
            }
            System.out.println("Word \"" + i + "\" contains " + count + " times");
        }
    }
}
