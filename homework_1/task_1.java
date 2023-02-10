//Задание 1.
//Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n


package homework_1;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        System.out.printf("Сумма от 1 до n равна: %s\n", countNumbers(n));
        System.out.printf("Произведение от 1 до n равно: %s", factorialNumbers(n));
        scanner.close();
    }


    public static int countNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 1) {
            sum += i;
        }
        return sum;
    }
    
    
    public static int factorialNumbers(int n) {
        int f = 1;

        for (int i = 1; i <= n; i += 1) {
            f *= i;     
        }
        return f;
    }    
}
