/**
 В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. 
Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */


package Homework_Java2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task1{
    public static void main(String[] args) throws IOException { 

        // Читаем из файла и запысываем в StringBuilder sb
        StringBuilder sb = new StringBuilder(); // создаем пустой объект класса StringBuilder
        try (BufferedReader br = new BufferedReader(new FileReader("Homework_Java2/person.json"))) { //читаем файл
            String data;//создаем переменную, чтобы пройтись с ней в цикле
            while ((data = br.readLine()) != null) { //считываем из потока построчно файл методом readLine, т.к. значения null нам не нужны, их исключаем
                sb.append(data); // все что попадает в переменную data с помощью метода append добавляем в sb
            }
        } catch (IOException e) { //обрабатываем ошибку при вводе/выводе данных
            e.printStackTrace(); // методом PrintStackTrace ()  будем отслеживать исключение
        }

        Map<String, String> dictionary = new HashMap<>(); // создаем словарь, элементы в котором будут храниться в формете "строка-строка"
        //Убираем ненужные символы и записываем данные в словарь
        String[] keys = sb.toString().replace("{", "").replace("\"", "").
                replace("}", "").replaceAll("\\s", "").split(",");
        for (String data : keys) { 
            String[] keyValue = data.split(":");
            String key = keyValue[0];
            String value = keyValue[1];
            dictionary.put(key, value);
        }
        System.out.println(dictionary);
        // Вывод из словаря в вид согласно заданию
        String name = dictionary.get("name");
        String country = dictionary.get("country");
        String city = dictionary.get("city");
        System.out.printf("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", name,
                country, city);
    }

}