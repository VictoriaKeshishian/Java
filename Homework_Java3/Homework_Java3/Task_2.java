/**
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */

package Homework_Java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 25, 60, 30, 21, 70, 89));

        System.out.println(list);

        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }

        }
        System.out.println(list);

    }
}
