package homework_6;

import java.util.Scanner;


public class notebooksInfo {
    private static final String MENU = "Выберите нужный пункт меню: "
            + "\n\t1 - Показать все ноутбуки"
            + "\n\t2 - Искать"
            + "\n\t5 - Вернуться назад, в главное меню"
            + "\n\t0 - Выход";

    public static void taskMenuSeminar6() {
        boolean itContinues = true;
        while (itContinues) {
            System.out.println(MENU);
            switch (Scanner.getIntFromInput("Выберите задачу: ")) {
                case 1:
                    TaskSem6.viewAllLaptop();
                    break;
                case 2:
                    TaskSem6.viewFilterLaptop();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Такого действия не существует!");
                    break;
            }
        }
        ScannerHelper.close();
    }
}
