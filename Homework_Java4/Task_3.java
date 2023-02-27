/**
 *  В калькулятор добавьте возможность отменить последнюю операцию.
 */


package Homework_Java4;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Task_3 {
    public static void main(String[] args) {

        int number1;
        int number2;
        int result = 0;
        String operation;

        number1 = inputNum("Введите первое число: ");
        number2 = inputNum("Введите второе число: ");
        operation = inputStr("Введите операцию: +, -, *, / ");
        
      
        Stack<Integer> stack = new Stack<>();
        if(Objects.equals(operation,"+")){
            result = number1 + number2;
        } else if(Objects.equals(operation, "-")){
            result = number1 - number2;
        }else if(Objects.equals(operation, "*")){
            result = number1 * number2;
        }else if(Objects.equals(operation, "/")){
            result = number1 / number2;
        }else{
            System.err.println("Invalid Operator Specified.");
        }
    

        System.out.println("ответ:" + result);
        stack.push(result);


        while (true) {
            operation = inputStr("\n> Введите операцию (+, -, *, /), " +
                    "\n> Либо ведите \"no\" для " +
                    "удаления последнего результата ");
            if (Objects.equals(operation, "no")) {
                System.out.println("удаленное значение: " + stack.pop());
                result = stack.peek();
                System.out.println("Текущее значение: " + result);
            } else {
                number2 = inputNum("Введите число: ");
                if (Objects.equals(operation, "+")) {
                    result = result + number2;
                } else if (Objects.equals(operation, "-")) {
                    result = result - number2;
                } else if (Objects.equals(operation, "*")) {
                    result = result * number2;
                } else if (Objects.equals(operation, "/")) {
                    result = result / number2;
                } else
                    System.err.println("Invalid Operator Specified.");
                stack.push(result);
                System.out.println("ответ = " + result);
            }
        }

    }



    public static int inputNum(String text){
        Scanner iScanner = new Scanner(System.in);
        System.out.print(text);
        int num = iScanner.nextInt();
        return num;
    }

    public static String inputStr(String text){
        Scanner iScanner = new Scanner(System.in);
        System.out.print(text);
        String str = iScanner.nextLine();
        return str;
    }

}

