/**ШПАРГАЛКА ПО ЛЕКЦИИ 1
 * programm
 */
//ПРОВЕРКА ТИПА ДАННЫХ
// public class programm {
//     public static void main(String[] args) {
        
//         var i = 123;
//         System.out.println(i);
//         System.out.println(getType(i));
//     }
//     static String getType(Object o){
//         return o.getClass() .getSimpleName();
//     }
    
// }  

//КЛАССЫ-ОБЕРТКИ
// public class programm {
//     public static void main(String[] args) {
        
//         int i = 123;
//         System.out.println(Integer.MAX_VALUE);
       
//     }
   
// }

/*public class programm {
    public static void main(String[] args) {
        
        String s = "qwer";
        s.charAt(1);
        System.out.println(s);
       
    }
   
} */

// ОПЕРАЦИИ
/* public class programm {
    public static void main(String[] args) {
        
        // int s = 123;
        // System.out.println(++s);
        // System.out.println(s);

        // boolean f = 123 <= 234;
        // System.out.println(f);

        /*int a = 8;
        // 1000
        //a = a << 1;
        System.out.println(a<<1);
        // 10000 */

        /*int a = 5;
        int b = 2;
        System.out.println(a|b);
        //101
        //010
        //111 */

       /* /*  boolean a = true;
        boolean b = true;
        System.out.println(a&b);
        //1
        //0
        //1 */

       /* String s = "qwer"; //4, 0...3
        //boolean b = s.length() >= 5 && s.charAt(4) == '1';
        //boolean b = s.length() >= 5 & s.charAt(4) == '1';
        //boolean b = s.length() >= 5 || s.charAt(4) == '1';
        boolean b = s.length() >= 5 | s.charAt(4) == '1';
        System.out.println(b); 



       
    }
   
}
*/

//МАССИВЫ
//одномерные
/*public class programm {
    public static void main(String[] args) {
        // int[] arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println(arr[3]);

    }
}*/

//ПРЕОБРАЗОВАНИЯ
/* public class programm {
    public static void main(String[] args) {
        byte b = Byte.parseByte("12"); // может хранить значения от 0 до 255
        System.out.println(b);

    }
}
*/ 

//ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА
/* 
import java.util.Scanner;
public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
 }
}
*/

//НЕКОТОРЫЕ ПРИМИТИВЫ
/* 
import java.util.Scanner;
public class programm {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
}}
*/

//ПРОВЕРКА НА СООТВЕТСТВИЕ ПОЛУЧАЕМОГО ТИПА
/* import java.util.Scanner;
    public class programm {
        public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
 } }
*/ 

//ФОРМАТИРОВАННЫЙ ВЫВОД
/* 
public class programm {
    public static void main(String[] args) {
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);
        String s = "qwe";
        int a = 123;
        String q = s + a;
        System.out.println(q);
    }
   }
*/
/* 
public class programm {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);
    }
   }
   */

/*
Виды спецификаторов
%d: целочисленных значений
%x: для вывода шестнадцатеричных чисел
%f: для вывода чисел с плавающей точкой
%e: для вывода чисел в экспоненциальной форме,
например, 3.1415e+01
%c: для вывода одиночного символа
%s: для вывода строковых значений

 */
/* 
 public class programm {
    public static void main(String[] args) {
   
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00
    }
   }
*/

//ОБЛАСТЬ ВИДИМОСТИ ПЕРЕМЕННЫХ
/* 
   public class programm {
    public static void main(String[] args) {
        int b = 111;
        { // блок кода(сложный оператор)
            int a = 222;
            System.out.println(a+b);
        }
        int a = 132;
        System.out.println(a);
    }
   }
*/

// ФУНКЦИИ И МЕТОДЫ
/* 
public class programm {
    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int a, int b) {
        return a+b;
    }
    static double factor(int n) {
        if(n==1)return 1;
    return n * factor(n-1);
    }
    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }}
*/

//УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
//условный оператор
/* 
public class programm {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
        c = a;
        } else {
        c = b;
        }
        System.out.println(c);
    }
   }
*/

//сокращенная форма условного оператора
/* 
public class programm {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;
        System.out.println(c);
    }
   }
*/

// тернарный оператор
/* 
public class programm {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b; // если условие a < b выполняется, то будет возвращена та часть, которая находится после вопросительного знака и до двоеточия
        // если a < b не выполняется, то вернется значение b
        System.out.println(min);
    }
}
*/

//оператор выбора

/*
public class programm {
    public static void main(String[] args) {
        int a = 123;
        switch (a) {
            case 1:
                System.out.println("a");
                break;
            default:
                break;
            case 2: 
                System.out.println("b");
                break;

        }
    }
}
*/
//ЦИКЛЫ

//while
/* 
public class programm {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
    }
    System.out.println(count);
    }
   }

*/

// do while
/*
public class programm {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
    } while (value != 0);
    System.out.println(count);
    }
   }
*/

//continue
/*
public class programm {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0) 
                continue;
            System.out.println(i);
        }
    }
}
*/

// for
/* 
public class programm {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
        s += i;
        }
    System.out.println(s);
    }
}
*/

//вложенные циклы
/*
public class programm {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    }
}
*/

//for in
/* 
public class programm {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int item : arr) {
        System.out.printf("%d ", item);
        }
        System.out.println();
    }
   }
   
*/

//Работа с файлами
/* 
import java.io.FileWriter;
import java.io.IOException;
public class programm {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) { //false или try отвечает за создание или дозапись уже имеющегося файла
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
 }
 } }
*/

/* чтение, вариант посимвольно
 import java.io.*;
public class Program {
 public static void main(String[] args) throws Exception {
 FileReader fr = new FileReader("file.txt");
 int c;
 while ((c = fr.read()) != -1) {
 char ch = (char) c;
 if (ch == '\n') {
 System.out.print(ch);
 } else {
 System.out.print(ch);
 }
 }
 } }
 */

 /* вариант построчно
  import java.io.*;
public class Program {
 public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new FileReader("file.txt"));
 String str;
 while ((str = br.readLine()) != null) {
 System.out.printf("== %s ==\n", str);
 }
 br.close();
 }
}
  */



