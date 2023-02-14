package Less2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String text = sc.nextLine();
        
        writeString(repeat(text));
        sc.close();
    }

    private static String repeat(String part) {
        StringBuilder fullMaker = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            fullMaker.append(part);
        }
        return fullMaker.toString();
    }
    private static void writeString(String str) {
        FileWriter file = null;
        try {
            file = new FileWriter("test.txt");
            file.append(str);
            System.out.println("Файл успешно создан");
        } catch (IOException ex) {
            System.err.println("Ошибка: " + ex);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException ex) {
                    System.err.println("Ошибка: " + ex);
                }
            }
        }
    }
}