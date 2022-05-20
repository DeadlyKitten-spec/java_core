package java2.HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private HashMap<String, String> map = new HashMap<>();

    public void add(String number, String sename){
        map.put(number, sename);
    }

    public void get(String sename){
        if(map.containsValue(sename)) {
            ArrayList<String> numbers = new ArrayList<>();
            for (Map.Entry<String, String> i : map.entrySet()) {
                if (i.getValue().equals(sename)) {
                    numbers.add(i.getKey());
                }
            }
            System.out.print("К фамилии " + sename + " привязаны следующие номера: ");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
            }
            System.out.println();
        }else{
            System.out.println("Фамилия не найдена");
        }
    }
}
