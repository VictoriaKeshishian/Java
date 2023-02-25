/**
 * 2 Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
 */

package Homework_Java4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(88);
        queue.add(75);
        queue.add(26);
        queue.add(1);
        System.out.println(queue);

        System.out.println("Введите элемент, который хотите добавить в конец очереди: ");
        Scanner scanner = new Scanner(System.in);
        int lastElement = scanner.nextInt();

        enqueue(queue, lastElement);
        scanner.close();

        dequeue(queue);
        first(queue);
    }

    private static void enqueue(LinkedList<Integer> queue, int lastElement) { // метод для добавления элемента в конец
                                                                              // очереди
        queue.addLast(lastElement);
        System.out.printf("Очередь с добавленным элементом: %s \n", queue);
    }

    private static void dequeue(LinkedList<Integer> queue) { // метод, который возвращает первый элемент из очереди и
                                                             // удаляет его
        System.out.println("Первый элемент очереди: ");
        System.out.println(queue.getFirst());
        queue.removeFirst();
        System.out.printf("Очередь с удаленным первым элементом: %s \n", queue);
    }

    private static void first(LinkedList<Integer> queue) { // метод, который возвращает первый элемент из очереди, не
                                                           // удаляя
        System.out.println("Первый элемент очереди: ");
        System.out.println(queue.getFirst());
        System.out.println(queue);
    }
}
