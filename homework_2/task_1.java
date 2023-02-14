//Задание 1.
//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.

//Входная строка:
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

//Выходная строка:
//select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"


package homework_2;

public class task_1 {
    public static void main(String[] args) {
        String request = "select * from students where ";
        String dataBase = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        String dataBaseNew = dataBase.replace("{", " ").replace("}", " ");
        StringBuilder stringBuilder = new StringBuilder(request);
        String[] dataBaseArr = dataBaseNew.split(",");

        for (int i = 0; i < dataBaseArr.length; i += 1) {
            String[] arrElem = dataBaseArr[i].replace("\"", " ").split(":");

            //С помощью equals сравниваем ЗНАЧЕНИЕ строк и отлавливаем "null"         

            if (!"null".equals(arrElem[1].trim())) {
                stringBuilder.append(arrElem[0].trim()).append(" = ").append("\"").append(arrElem[1].trim()).append("\"");
            }
            if (i < dataBaseArr.length - 2) {
                stringBuilder.append(" and ");
            }
        }
        System.out.println(stringBuilder);
    }
}    

