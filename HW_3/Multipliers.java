package HW_3;

import java.util.Scanner;

public class Multipliers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        boolean hasMultipliers = false;

        System.out.printf("%d is a product of:%n", num);
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.printf("%d and %d%n", i, num / i);
                hasMultipliers = true;
            }
        }

        if (!hasMultipliers) {
            System.out.printf("The number %d has no multipliers, so it is a prime number.%n", num);
        }
    }
}
