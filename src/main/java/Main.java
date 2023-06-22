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
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

//        List<String> file = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\autotests\\homework5\\gb_homework_sem2\\src\\main\\java\\first.json"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                file.add(line);
//            }
//        } catch (IOException e) {
//            System.err.format("IOException: %s%n", e);
//        }

        System.out.println(file);
    }
}
