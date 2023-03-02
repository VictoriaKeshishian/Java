package Less6;

import java.util.*;

/**
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
 */
public class Task0 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(List.of (400, 500, 600, 100, 200, 300));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of (4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(List.of (4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(treeSet);
    }
}