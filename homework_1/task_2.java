//Задание 2.
//Вывести все простые числа от 1 до 1000


package homework_1;

public class task_2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i += 1) {
            if (checkNumber(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static Boolean checkNumber(int num) {
        for (int i = 1; i <= Math.sqrt(num); i += 1) {
            if ((num == 1) || (num % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
