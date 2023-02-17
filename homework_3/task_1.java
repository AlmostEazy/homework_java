//Задание 1.
//Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.


package homework_3;

import java.util.ArrayList;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        int j = 0;
        ArrayList <Integer> list = new ArrayList <Integer> ();
        Random random = new Random();

        for (int i = 0; i < 10; i += 1) {
            list.add(random.nextInt(50));
        }
        
        System.out.println("Ваш список: " + list);

        while (j < list.size()) {
            if (list.get(j) % 2 == 0) {
                list.remove(j);
            } else {
                j += 1;
            }
        }

        System.out.println("Ваш новый список: " + list);  
    }
    
}
