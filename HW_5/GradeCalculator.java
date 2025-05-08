package HW_5;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество баллов: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Оценка: A");
        } else if (score >= 80) {
            System.out.println("Оценка: B");
        } else if (score >= 70) {
            System.out.println("Оценка: C");
        } else if (score >= 60) {
            System.out.println("Оценка: D");
        } else {
            System.out.println("Оценка: F");
        }

        scanner.close();
    }
}

