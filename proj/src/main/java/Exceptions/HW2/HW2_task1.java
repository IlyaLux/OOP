package Exceptions.HW2;

import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//необходимо повторно запросить у пользователя ввод данных.
public class HW2_task1 {
    public static void main(String[] args) {
        Float num = getFloatNumberFromUser();
        System.out.println("Введенное число: " + num);
    }

    public static Float getFloatNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число.");
        System.out.println("В качестве разделителя используйте символ точки.");
        System.out.print("> ");
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод, повторите:");
                System.out.print("> ");
            }
        }
    }
}
