//Задание 1.
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


package homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phone = new HashMap<>();
        addNumber("Ivanov", 880055535, phone);
        addNumber("Ivanov", 893565789, phone);
        addNumber("Petrov", 892089365, phone);
        addNumber("Sidorov", 895647758, phone);
        printBook(phone);
       }

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
