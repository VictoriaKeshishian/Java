package LaptopShop;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(" Lenovo IdeaPad 3 15IGL05", 4, 1000, "Windows", 22999, "серый"));
        laptops.add(new Laptop(" HUAWEI MateBook D 14 NbD-WDI9", 8, 500, "Windows", 39999, "серебристый"));
        laptops.add(new Laptop(" Apple MacBook Air", 8, 1000, "macOS", 71799, "золотистый"));
        laptops.add(new Laptop(" ASUS Laptop 15 D543MA-DM1368", 4, 1000, "Windows", 19999, "черный"));
        laptops.add(new Laptop(" Acer Extensa 15 EX215-31-C3FF", 4, 500, "Windows", 22999, "черный"));
        laptops.add(new Laptop(" Honor MagicBook 15 BMH-WFQ9HN", 16, 1000, "Windows", 39799, "серый"));

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Введите цифру, соответствующую выбранному критерию:\n 1 - оперативная память \n 2 - объем жесткого диска \n 3 - операционная система ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Введите значение ОЗУ(4,8,16): ");
            Integer operative = sc.nextInt();

            for (Laptop laptop : laptops) {
                if (laptop.getRam().equals(operative)) {
                    System.out.println(laptop.toString());
                } 
            }
        }

        else if (choice == 2) {
            System.out.println("Введите объем жесткого диска(1000 или 500): ");
            Integer hard = sc.nextInt();

            for (Laptop laptop : laptops) {
                if (laptop.getHardDrive().equals(hard)) {
                    System.out.println(laptop.toString());
                } 
            }
        }

        else if (choice == 3) {
            System.out.println("Введите операционную систему(Windows, macOS): ");
            Scanner scan = new Scanner(System.in);
            String operationSystem = scan.nextLine();

            for (Laptop laptop : laptops) {
                if (laptop.getOs().equalsIgnoreCase(operationSystem)) {
                    System.out.println(laptop.toString());
                }

            }
            scan.close();

        } 

        sc.close();

    }

}
