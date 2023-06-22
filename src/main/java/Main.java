//Задание
//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//используя StringBuilder и/или String. Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import com.sun.nio.sctp.SctpSocketOption;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("C:\\Users\\hp\\IdeaProjects\\autotests\\homework5\\gb_homework_sem2\\src\\main\\java\\first.json");
        Scanner scanner = new Scanner(file);
        List<StringBuilder> files = new ArrayList<>();
        while (scanner.hasNextLine()){
            files.add(new StringBuilder(scanner.nextLine()));
        }
        System.out.println(files);
        files.remove(0);
        files.remove(4);


        for (StringBuilder s : files) {
            int index = s.indexOf(":") + 1;
            s.delete(0, index);
//            s = new StringBuilder(s.toString().replaceAll("[^A-Za-z0-9]", ""));
            System.out.println(s);
            if (s == null ){
                files.remove(files.indexOf(s));
                }
            }
        System.out.println(files);
        }
}
