//Задание 3.
//Реализовать простой калькулятор (операции + - / * )


package homework_1;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int a = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int b = scanner.nextInt();
        System.out.println("Введите операцию: ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(a + " + " + b + " = " + add(a, b)); 
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + minus(a, b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + divide(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + mult(a, b));
                break;
            
            default:
                System.out.println("Такой операции нет");      
        }
        scanner.close();        
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        if (b != 0) return a/b;          
            else 
        return -1;
    }

    private static int mult(int a, int b) {
        return a * b;
    }  
}
