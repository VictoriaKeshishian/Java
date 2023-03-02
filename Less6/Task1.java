/**
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве,
 и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

 */
package Less6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(25);
        }
        System.out.println(calcPercent(array));
    }

    private static float calcPercent(int[] array) {
        Set<Integer> uniq = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            uniq.add(array[i]);
        }
        return uniq.size() * 100f / array.length;
    }
}