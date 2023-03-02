/**
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java

 */
package Less6;

import java.time.LocalDate;

public class Programm {
    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination(LocalDate.of(2023, 2, 28), "Bayer", "столбняк");
        System.out.println(vaccination);
        // vaccination.setDate(LocalDate.of(2001, 1, 1));
        System.out.println(vaccination.getDate());

        Cat cat = new Cat("Барсик", "Виктория", "Британец", LocalDate.of(2001, 1, 20), "Белый");
        cat.addVaccination(vaccination);
        cat.addVaccination(new Vaccination(LocalDate.of(2008, 1, 5), "Bayer", "корь"));
        System.out.println(cat);

    }
}
