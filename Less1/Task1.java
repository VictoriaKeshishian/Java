
/*
 Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */

package Less1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите свое имя: ");
        Scanner sc = new Scanner(System.in, "cp866"); //cp866 ввод для русской раскладки 
        String myName = sc.nextLine();
        //System.out.println(String.format("Привет, %s! ", myName));
        System.out.printf(String.format("Привет, %s!\n ", myName));
        sc.close();
        



    }
    
}
