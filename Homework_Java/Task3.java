//Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4

package Homework_Java;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int number1 = iScanner.nextInt();
        System.out.printf("Введите операцию: +, -, *, /  ");
        char operation = iScanner.next().charAt(0);
        System.out.printf("Введите второе число: ");
        int number2 = iScanner.nextInt();
        
        if (operation == '+') {
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (operation == '-') {
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (operation == '*') {
            System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
        } else if (operation == '/') {
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        } else {
            System.err.println("Invalid Operator Specified.");
        }
    iScanner.close();
     
    }
}
