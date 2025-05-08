package HW_5;

import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int numStudents = scanner.nextInt();

        int totalScore = 0;
        int count = 0;

        while (count < numStudents) {
            System.out.print("Введите оценку студента #" + (count + 1) + ": ");
            int score = scanner.nextInt();
            totalScore += score;
            count++;
        }

        double average = totalScore / (double) numStudents;
        System.out.println("Средний балл: " + average);

        scanner.close();
    }
}

