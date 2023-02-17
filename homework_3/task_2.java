//Задание 2:
//Создать список целых чисел (заполнить случайными числами).
//Найти минимальное, максимальное и среднее из этого списка.


package homework_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class task_2 {
    public static void main(String[] args) {
        float sum = 0;
        float average;
        ArrayList <Integer> list = new ArrayList <Integer> ();
        Random random = new Random();

        for (int i = 0; i < 5; i += 1) {
            list.add(random.nextInt(10));
        }

        int max = Collections.max(list);
        int min = Collections.min(list);

        for (int i = 0; i < list.size(); i += 1) {
            sum += list.get(i);
        }

        average = sum / list.size();

        System.out.println("Ваш список: " + list);
        System.out.println("Максимальное число списка: " + max);
        System.out.println("Минимальное число списка: " + min);
        System.out.println("Среднее арифметическое списка: " + average);
    }
}
