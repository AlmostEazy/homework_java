//Задание 3 *.
//Реализовать алгоритм сортировки пузырьком


package homework_3;

import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        Random random = new Random();

        int arr[] = new int[10];
        int temp;

        for (int i = 0; i < 10; i += 1) {
            arr[i] = random.nextInt(50);
        }

        System.out.println("Ваш массив: " + java.util.Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i += 1) {
            for (int j = 0; j < arr.length - 1 - i; j += 1) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                }
            }
        }
        
        System.out.println("Ваш массив после сортировки: " + java.util.Arrays.toString(arr));
    }
}
