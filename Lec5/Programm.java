import java.util.Arrays;
import java.util.HashSet;

public class Programm {
    public static void main(String[] args) {
        
    Worker w1 = new Worker();
    w1.firstName = "Имя_1";
    w1.lastName = "фамилия_1";
    w1.salary = 100;
    w1.id = 1000;

    Worker w4 = new Worker();
    w1.firstName = "Имя_1";
    w1.lastName = "фамилия_1";
    w1.salary = 100;
    w1.id = 1000;
    
    Worker w2 = new Worker();
    w1.firstName = "Имя_2";
    w1.lastName = "фамилия_2";
    w1.salary = 200;
    w1.id = 2000;

    Worker w3 = new Worker();
    w1.firstName = "Имя_3";
    w1.lastName = "фамилия_3";
    w1.salary = 300;
    w1.id = 3000;

    System.out.println(w1.toString());
    System.out.println(w3.toString());
    System.out.println(w4.toString());
    System.out.println(w4.toString());

    System.out.println(w1==w4);
    System.out.println(w1.equals(w4));
    var workers = new HashSet<Worker>(Arrays.asList(w1,w2,w3));
    System.out.println(workers.contains(w4));
    }
}
