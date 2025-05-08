package HW_3;
import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double average = sum / 2;

        System.out.printf("Сумма: %.2f%n", sum);
        System.out.printf("Среднее: %.2f%n", average);
        System.out.printf("Сравнение: %s%n", num1 > num2 ? "Первое больше" : num1 < num2 ? "Второе больше" : "Они равны");
    }
}
