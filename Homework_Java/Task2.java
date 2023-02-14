//Вывести все простые числа от 1 до 1000
package Homework_Java;

import java.util.ArrayList; // динамический массив для изменения размера массива в зависимости от заданного числа
import java.util.List; // для добавления элементов в список

public class Task2 {
    public static void main(String[] args) {
        int input = 1000;
        List<Integer> arr = new ArrayList<>();

        // перебор чисел
        for (int i = 2; i < input; i++) {
            boolean isPrimeNumber = true;

            // проверка на простое число
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // выход из внутреннего цикла for
                }
            }

            if (isPrimeNumber) {
                arr.add(i);
               
            }
        }
        
        System.out.println("Количество проcтых чисел: " + arr.size() + ", список: " + arr.toString());
        
    }
}
