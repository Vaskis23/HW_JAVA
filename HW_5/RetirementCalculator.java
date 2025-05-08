package HW_5;

import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        System.out.print("Введите ваш пол (мужчина - m, женщина - w): ");
        char gender = scanner.next().charAt(0);

        // Определение пенсионного возраста
        int retirementAge = (gender == 'm') ? 70 : 65;

        // Вычисление лет до пенсии
        if (age < retirementAge) {
            int yearsLeft = retirementAge - age;
            System.out.println("До пенсии осталось " + yearsLeft + " лет.");
        } else if (age > retirementAge) {
            int yearsSinceRetirement = age - retirementAge;
            System.out.println("Вы вышли на пенсию " + yearsSinceRetirement + " лет назад.");
        } else {
            System.out.println("Поздравляем! Вы выходите на пенсию в этом году.");
        }

        scanner.close();
    }
}

