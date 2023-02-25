//1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


package Homework_Java4;

import java.util.Collections;
import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<String> elements = new LinkedList<>();

        String element1 = "Тише";
        String element2 = "едешь";
        String element3 = " - ";
        String element4 = "дальше";
        String element5 = "будешь";
       
        elements.add(element1);
        elements.add(element2);
        elements.add(element3);
        elements.add(element4);
        elements.add(element5);

        System.out.println(elements);
        Collections.reverse(elements);
        System.out.println(elements);

    }
}
