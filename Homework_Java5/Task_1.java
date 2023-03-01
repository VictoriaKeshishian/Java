/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
 */

package Homework_Java5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task_1 {

    public static Map<String, List<String>> numbersGude= new HashMap<>();
    public static void main(String[] args) {
        namesPhone();
        findNumber("Артур Дент");
    }
 
     private static void namesPhone(){
        numbersGude.put("Иван Иванов", List.of("644-219-20-15", "7082818-43-99"));
        numbersGude.put("Петров Петр", List.of("9666-219-20-15", "58856818-43-89"));
        numbersGude.put("Васильев Василий", List.of("644-219-00-15", "58718-43-79"));
        numbersGude.put("Дарт Вейдер", List.of("334-219-20-95", "3082818-43-88"));
        numbersGude.put("Джек Воробей", List.of("674-889-30-15", "3022818-73-77"));
        numbersGude.put("Артур Дент", List.of("044-214-20-12", "5050818-03-94"));
        
    }
 
    private static void findNumber(String name){
        System.out.printf("%s: %s", name, numbersGude.get(name));
    }
 
}
 