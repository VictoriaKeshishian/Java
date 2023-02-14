/*
 Дан массив двоичных чисел, например [1,1,0,1,1,1], 
 вывести максимальное количество подряд идущих 1.
 */

package Less1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        int count = 0, result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count = 0;
            } else {
                count++;
                result = Math.max(result, count);
            }
        }
        System.out.println(result);
    }
}


// int[] array = new int[] {1,1,0,1,1,1};
//         int count = 0;
//         int result = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i]==1) {count++;}
//             else{
//                 if(count>result) {result = count;}
//                 count = 0;
//             }
//             if (array[i]==1) {count++;}
//         }
//         System.out.println(result);