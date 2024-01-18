package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №4 (часть 1)");
        System.out.println("Имеется база данных пользователей из 10 человек");
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 25, "ivanov@pochta.ru"),
                new User("Петров", "Петр", "Петрович", 30, "petrov@pochta.ru"),
                new User("Васильев", "Василий", "Васильевич", 35, "vasilyev@pochta.ru"),
                new User("Антонов", "Антон", "Антонович", 40, "antonov@pochta.ru"),
                new User("Павлов", "Павел", "Павлович", 45, "pavlov@pochta.ru"),
                new User("Радионов", "Радион", "Радионович", 50, "radionov@pochta.ru"),
                new User("Андреев", "Андрей", "Андреевич", 55, "andreev@pochta.ru"),
                new User("Сергеев", "Сергей", "Сергеевич", 60, "sergeev@pochta.ru"),
                new User("Николаев", "Николай", "Николаевич", 65, "nikolaev@pochta.ru"),
                new User("Радионов", "Радион", "Радионович", 70, "radionov@pochta.ru")
        };
        System.out.println("Необходимо выбрать пользователей старше 40 лет");
        for (int i = 0; i < 10; i++) {
            if (users[i].getAge() > 40) {
                users[i].info();
            }
        }
        System.out.println();
        System.out.println("Домашняя работа №4 (часть 2)");
        Box box = new Box(10, 20, 40, "Красный", false, true);
        box.info();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Что Вы хотите сделать с коробкой?");
            System.out.println("1 - Покрасить коробку");
            System.out.println("2 - Положить предмет в коробку");
            System.out.println("3 - Вытащить предмет из коробки ");
            System.out.println("4 - Открыть коробку");
            System.out.println("5 - Закрыть коробку");
            System.out.println("Выход - любая другая цифра");
            int scanner1 = scanner.nextInt();

            switch (scanner1) {
                case (1):
                    System.out.println("В какой цвет Вы хотите покрасить коробку?");
                    String Scanner2 = scanner.nextLine();
                    box.setColor(Scanner2);
                    System.out.println("Цвет коробки изменился на " + box.getColor());
                    break;
                case (2):
                    box.putInBox();
                    break;
                case (3):
                    box.pullOutBox();
                    break;
                case (4):
                    box.openBox();
                    break;
                case (5):
                    box.closeBox();
                    break;
                default:
                    return;
            }


        }
    }
}



