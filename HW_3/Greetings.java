package HW_3;

import java.util.Scanner;

class Greetings {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите язык: 1 - Английский, 2 - Русский, 3 - Французский, 4 - Немецкий");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.printf("Hello!%n");
            case 2 -> System.out.printf("Привет!%n");
            case 3 -> System.out.printf("Bonjour!%n");
            case 4 -> System.out.printf("Hallo!%n");
            default -> System.out.printf("Неизвестный язык.%n");
        }
    }
}