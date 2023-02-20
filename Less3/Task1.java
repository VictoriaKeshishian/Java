// Заполнить список десятью случайными числами. 
//Отсортировать список методом sort() и вывести его на экран.

package Less3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            list1.add(rnd.nextInt(0, 11));
        }
        System.out.println(list1);
        list1.sort(new MyComparator());
        System.out.println(list1);
    }
}
