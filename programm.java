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


// OBJECT

/**
 
public class Ex01_object {
 public static void main(String[] args) {
 Object o = 1; GetType(o); // java.lang.Integer
 o = 1.2; GetType(o); // java.lang.Double
 }
 static void GetType(Object obj) {
 System.out.println(obj.getClass().getName());
 }
}


public class Ex01_object {
 public static void main(String[] args) {
 System.out.println(Sum(1, 2));
 System.out.println(Sum(1.0, 2));
 System.out.println(Sum(1, 2.0));
 System.out.println(Sum(1.2, 2.1));
 }
 static int Sum(int a, int b) { ...
 }
 static double Sum(double a, double b) { ...
 }
}


public class Ex01_object {
 public static void main(String[] args) {
    System.out.println(Sum(1, 2));
    System.out.println(Sum(1.0, 2));
    System.out.println(Sum(1, 2.0));
    System.out.println(Sum(1.2, 2.1));
 }
 static int Sum(int a, int b) { ...
 }
 static double Sum(double a, double b) { ...
 }
 static String Sum(String a, String b) { ...
 }
}
 public class Ex01_object {
 public static void main(String[] args) {
 System.out.println(Sum(1, 2));
 System.out.println(Sum(1.0, 2));
 System.out.println(Sum(1, 2.0));
 System.out.println(Sum(1.2, 2.1));
 }
 static Object Sum(Object a, Object b) {
 if (a instanceof Double && b instanceof Double) {
 return (Object)((Double) a + (Double) b);
 } else if(a instanceof Integer && b instanceof Integer) {
 return (Object)((Integer) a + (Integer) b);
 } else return 0;
 }
}
 */


 //МАССИВЫ

// увеличить размер массива
// Есть массив из 2 элементов, необходимо добавить 3-ий

/* 
public class Ex01_object {
 public static void main(String[] args) {
 int[] a = new int[] { 1, 9 };
 int[] b = new int[3];
 System.arraycopy(a, 0, b, 0, a.length);
 for (int i : a) { System.out.printf("%d ", i);} // 1 9
 for (int j : b) { System.out.printf("%d ", j);}
 // 0 9 0 0 0 0 0 0 0 0
 } }
*/
// метод для добавления элемента в массив
// public class Ex01_object {
//     static int[] AddItem(int[] array, int item) {
//     int length = array.length;
//     int[] temp = new int[length + 1];
//     System.arraycopy(array, 0, temp, 0, length);
//     temp[length] = item;
//     return temp;
//     }
//     public static void main(String[] args) {
//     int[] a = new int[] { 0, 9 };
//     for (int i : a) { System.out.printf("%d ", i); }
//     a = AddItem(a, 2);
//     a = AddItem(a, 3);
//     for (int j : a) { System.out.printf("%d ", j); }
//     }
//    }

//КОЛЛЕКЦИИ

//ArrayList

// import java.util.ArrayList;

// public class programm {
//     public static void main(String[] args) {
//         ArrayList<Integer> List = new ArrayList<Integer>();
//         List.add(2809);

//         for(Object o : List) {
//             System.out.println(o);
//         }
//     }
// }
   
// Разные способы создания
// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3);

//КОЛЛЕКЦИИ ФУНКЦИОНАЛ

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список


// import java.util.List;
// public class Ex006_ListOf {
//  public static void main(String[] args) {
//  Character value = null;
//  List<Character> list1 =
//  List.of('S', 'e', 'r', 'g', 'e', 'y');
//  System.out.println(list1);
//  // list1.remove(1); // java.lang.UnsupportedOperationException
//  List<Character> list2 = List.copyOf(list1);
//  }
// }

//ИТЕРАТОР

// import java.util.*;
// public class Ex007_Iterator {
//  public static void main(String[] args) {
//  List<Integer> list = List.of(1, 12, 123, 1234, 12345);
//  for (int item : list) { System.out.println(item); }
//  Iterator<Integer> col = list.iterator();
//  while (col.hasNext()) {
//  System.out.println(col.next());

//  }
//  }
// }


// import java.util.*;
// public class Ex007_Iterator {
//  public static void main(String[] args) {
//  List<Integer> list = List.of(1, 12, 123, 1234, 12345);
//  for (int item : list) { System.out.println(item); }
//  Iterator<Integer> col = list.iterator();
//  while (col.hasNext()) {
//  //System.out.println(col.next());
//  col.next();
//  col.remove();
//  }
//  }
// }



// public class Homework3_JSONtoText {
//     public static void main(String[] args) {
//         String input = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//         input = clip (input);  // убрать []
//         String[] students = input.split (", ");
        
//         for (String student : students) {
//             student = clip (student);
//             String[] keyValues = student.split (",");
//             String name = "", grade = "", subject = "";
//             for (String keyValue : keyValues) {
//                 String[] keyValueParts = keyValue.split (":");
//                 String key = clip (keyValueParts[0]);
//                 String value = clip (keyValueParts[1]);

//                 if (key.equals ("фамилия"))
//                     name = value;
//                 else if (key.equals ("оценка"))
//                     grade = value;
//                 else if (key.equals ("предмет"))
//                     subject = value;
//                 else
//                     throw new IllegalStateException("Не понял, что за поле");
//             }
//             System.out.printf("Студент %s получил %s по предмету %s.\n", name, grade, subject);
//         }
//     }

//     private static String clip (String str) {
//         return str.substring(1, str.length() - 1);
//     }
// }



// import java.util.Arrays;
// import java.util.logging.*;

// // Реализуйте алгоритм сортировки пузырьком числового массива,
// // результат после каждой итерации запишите в лог-файл.
// public class Homework2_BubbleSortLogging {
// private static Logger logger = Logger.getLogger(Homework2_BubbleSortLogging.class.getName());

// public static void main(String[] args) {
// int[] array = { 1, 6, 2, 3, 9, 0, 4 };
// System.out.println(Arrays.toString(array));
// bubbleSort (array);
// System.out.println(Arrays.toString(array));
// }

// private static void bubbleSort (int[] array) {
// for (int ceiling = array.length; ceiling >= 0; ceiling--) {
// for (int i = 0; i < ceiling && i + 1 < ceiling; i++)
// if (array[i] > array[i + 1]) {
// int temp = array[i];
// array[i] = array[i + 1];
// array[i + 1] = temp;
// logger.log (Level.INFO, String.format ("%d <-> %d, %s",
// array[i], array[i +







/*/Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/


// package Homework_Java2;

// import java.io.IOException;
// import java.util.Arrays;
// import java.util.logging.*;

// public class Task2 {
//     static Logger logger = Logger.getLogger(Task2.class.getName());
    
//     public static void main(String[] args) throws IOException {
//         //Logger logger = Logger.getLogger(Task2.class.getName());
//         // logger.setLevel(Level.INFO);
//         // FileHandler ch = new FileHandler("LogTask2.xml");
//         // logger.addHandler(ch);
//         // XMLFormatter xml = new XMLFormatter();
//         // ch.setFormatter(xml);
//         // logger.log(Level.WARNING, "Test");
//         // logger.info("Sort Array");
//         int [] arr = new int[] {2,6,7,4,5,1,3,9,8};
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//         int[] newArr = bubleSort(arr);
//         System.out.printf("\n Отсортированный массив: \n");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(newArr[i]);
//         }

//     }
//     public static int[] bubleSort (int[]arr) throws SecurityException, IOException{
//         logger.setLevel(Level.INFO);
//         FileHandler ch = new FileHandler("LogTask2.xml");
//         //logger.addHandler(ch);
//         //XMLFormatter xml = new XMLFormatter();
//         //ch.setFormatter(xml);
//         //logger.log(Level.WARNING, "Test");
//         //logger.info("Sort Array");
//         for (int j = 0; j < arr.length - 1; j++) {
//             for (int i = 0; i < arr.length - j -1; i++) {
//                 if(arr[i] > arr[i+1]){
//                     int buf = arr[i];
//                     arr[i] = arr[i+1];
//                     arr[i+1] = buf;
//                     logger.log (Level.INFO, String.format("%d <-> %d, %s", arr[i],arr[i+1],Arrays.toString(arr)));
//                     logger.addHandler(ch);
//                 }    
//             }
//         }
//         return arr;

//     }
        
//     }