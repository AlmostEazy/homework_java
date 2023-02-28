package homework_6;

import java.util.HashSet;
import java.util.Set;

public class notebooksInfo {
    public static void main(String[] args) 
    {
        System.out.println("\n Добро пожаловать в каталог ноутбуков!");
        Set<laptopPC> set = new HashSet<>();
        set.add(new laptopPC
        ("001", 32, "Mac", 1024, "Apple"));
        set.add(new laptopPC
        ("002", 16, "Windows", 1024, "HUAWEI"));
        set.add(new laptopPC
        ("003", 12, "linux", 256, "Maibenben"));
        set.add(new laptopPC
        ("004", 8, "Windows", 512, "Acer"));
        set.add(new laptopPC
        ("005", 4, "Windows", 128, "Irbis"));
    
        program operation = new program(set);
        operation.start();
        System.out.println("\nПриходите еще!");

    }
}
