package HW_3;

import java.util.Scanner;

class EvenOdd {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        System.out.printf("Число %d %s%n", num, (num % 2 == 0) ? "чётное" : "нечётное");
    }
}
