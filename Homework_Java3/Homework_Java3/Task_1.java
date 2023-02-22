// //Реализовать алгоритм сортировки слиянием.

package Homework_Java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_1 {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(7, 99, 4, -9, 34, 58, 4);
            System.out.println(sort(list));
        }
    
        public static List<Integer> sort(List<Integer> mass) {
            if(mass.size() < 2) {    // базовый случай выхода из рекурсии, когда массив имеет 0 или 1 элемент
                return mass;
            }
            else  {
                int delimiter = mass.get(0); // число, относительно которого разделяем массивы
                List<Integer> left = new ArrayList<>(); // левая сторона - числа меньше delimiter
                List<Integer> right = new ArrayList<>(); // правая сторона - числа больше delimiter
                for (int i = 1; i < mass.size(); i++) {
                    if (mass.get(i) < delimiter) {
                        left.add(mass.get(i));
                    } else {
                        right.add(mass.get(i));
                    }
                }
                return merger(sort(left), delimiter, sort(right)); // вызываем sort у новых массивов
            }
        }
    
        //соединяем левую сторону + delimiter + правую сторону
        private static List<Integer> merger(List<Integer> left, int del, List<Integer> right) {
            left.add(del);
            left.addAll(right);
            return left;
        }
    }
