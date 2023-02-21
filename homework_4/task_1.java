//Задание 1.
//​Создать LinkedList целых чисел (заполнить случайными числами).
//Реализуйте метод, который вернет “перевернутый” список.


package homework_4;

import java.util.LinkedList;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i += 1) {
            list.add(random.nextInt(50));
        }

        System.out.println("Ваш список: " + list);
        LinkedList<Integer> revertList = revertList(list);
        System.out.println("Ваш перевернутый список: " + revertList);
    }
    

    public static LinkedList<Integer> revertList (LinkedList<Integer> someList) {
        LinkedList<Integer> revertLinkedList = new LinkedList<>();

        for (int i = someList.size() - 1; i >= 0; i -= 1) {
            revertLinkedList.add(someList.get(i));                    
        }

        return revertLinkedList;
    }
}
