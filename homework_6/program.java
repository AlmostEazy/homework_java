package homework_6;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {

        List<laptopPC> notebooks = new ArrayList<>();
       
        notebooks.add(new laptopPC(notebooks.size(), "Apple", "MacBook Pro", "Silver", 13.3, "M2", "SSD", 3.2,
                        32, 1024,
                        "MacOS"));
        notebooks.add(
                        new laptopPC(notebooks.size(), "Huawei", "MateBook 14", "Grey", 14.2, "AMD Ryzen",
                                        "SSD", 2.2, 16, 512,
                                        "Windows 10"));
        notebooks.add(
                        new laptopPC(notebooks.size(), "Asus", "Vivobook Go 14", "Black", 14, "Intel Pentium",
                                        "SSD", 1.1, 8,
                                        256, "no OS"));
        notebooks.add(
                        new laptopPC(notebooks.size(), "Huawei", "MateBook D14", "Silver", 14, "Intel Core",
                                        "SSD", 2.4, 8, 512,
                                        "Windows"));
        notebooks.add(new laptopPC(notebooks.size(), "Hauwei", "MateBook D 15", "Grey",
                        15.6, "Intel Core", "SSD", 2.8, 16, 512, "Windows"));
        notebooks.add(new laptopPC(notebooks.size(), "Asus", "TUF Gaming F15",
                        "Grey", 15.6, "Intel Core", "SSD", 2.7, 16, 512, "no OS"));
        notebooks.add(
                        new laptopPC(notebooks.size(), "Huawei", "MateBook D16", "Space grey", 16, "Intel Core",
                                        "SSD", 3.3,
                                        16, 512, "Windows"));
        notebooks.add(new laptopPC(notebooks.size(), "Honor", "MagicBook 16", "Space grey",
                        16.1, "AMD Ryzen", "SSD", 3.3, 16, 512, "Windows"));
        notebooks.add(new laptopPC(notebooks.size(), "Apple", "MacBook Pro 14",
                        "Space grey", 14.2, "M1", "SSD", 3.2, 16, 1024, "MacOS"));
        notebooks.add(new laptopPC(notebooks.size(), "Apple", "MacBook Air",
                        "Black", 13.6, "M2", "SSD", 3.5, 8, 256, "MacOS"));

        for (laptopPC notebook : notebooks) {
                System.out.println(notebook.getInfo());
                System.out.println();
        }

        notebooksInfo notebookList = new notebooksInfo(notebooks);
        List<laptopPC> filterList = notebookList.View();
        System.out.println(filterList.size());
        for (laptopPC notebook : filterList) {
                System.out.println(notebook.getInfo());
                System.out.println();
        }
    }
}
