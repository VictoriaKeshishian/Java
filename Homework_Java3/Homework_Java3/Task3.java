/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
 */

package Homework_Java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(448, 25, 97, 30, 1, 7, 9));
        System.out.println(list);

        System.out.printf("Максимальное число: %s \n",Collections.max(list));
        System.out.printf("Минимальное число: %s \n",Collections.min(list));

        int average = 0;
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);
        }
        System.out.printf("Среднее арифметическое: %s \n",average/list.size());
    
    }
    
}

