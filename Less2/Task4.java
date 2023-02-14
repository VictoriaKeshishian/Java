/**
 * Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
			1 Расширение файла: txt
			2 Расширение файла: pdf
			3 Расширение файла: 
			4 Расширение файла: jpg
 */
package Less2;

import java.io.File;

public class Task4 {
    public static void main(String[] args) {
        File dir = new File(".");
        showExtension(dir.list());
    }

    private static void showExtension(String[] fileNames) {
        for (int i = 0; i < fileNames.length; i++) {
            int pos = fileNames[i].lastIndexOf('.');
            if (pos == -1) {
                System.out.println();
                continue;
            }
            System.out.println(fileNames[i].substring(pos + 1));
        }
    }
}
