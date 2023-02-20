package Homework_Java2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task_2 {

private static Logger logger = Logger.getLogger(Task_2.class.getName());

public static void main(String[] args) throws IOException {

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
public static int[] bubleSort (int[]arr) throws SecurityException, IOException{
    logger.setLevel(Level.INFO);
    FileHandler ch = new FileHandler("LogTask2.xml");

    for (int j = 0; j < arr.length - 1; j++) {
        for (int i = 0; i < arr.length - j -1; i++) {
            if(arr[i] > arr[i+1]){
                int buf = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = buf;
                logger.log (Level.INFO, String.format("%d <-> %d, %s", arr[i],arr[i+1],Arrays.toString(arr)));
                logger.addHandler(ch);
            }    
        }
    }
    return arr;

}
    
}