// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homework_Java;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = iScanner.nextInt();
        
        int summ = 0;
        for (int i = 1; i <= number; i++) {
            summ = summ + i;
        }
        int multi = 1;
        for (int i = 1; i <= number; i++) {
            multi = multi * i;
        }

        System.out.printf("Сумма чисел от 1 до n, %s!\n", summ);
        System.out.printf("Произведение чисел от 1 до n, %s!", multi);
        iScanner.close();

    }

}
