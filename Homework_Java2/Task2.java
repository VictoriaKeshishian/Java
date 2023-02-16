//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


package Homework_Java2;

import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler ch = new FileHandler("LogTask2.xml");
        logger.addHandler(ch);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Test");
        logger.info("Sort Array");
        int [] arr = new int[] {2,6,7,4,5,1,3,9,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] newArr = bubleSort(arr);
        System.out.printf("\n Отсортированный массив: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
    public static int[] bubleSort (int[]arr){
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j -1; i++) {
                if(arr[i] > arr[i+1]){
                    int buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }    
            }
        }
        return arr;

    }
        
    }

