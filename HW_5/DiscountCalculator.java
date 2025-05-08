package HW_5;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmount = 0;
        boolean continueShopping = true;

        while (continueShopping) {
            System.out.print("Введите цену товара (или 0 для завершения): ");
            double price = scanner.nextDouble();
            if (price == 0) {
                continueShopping = false;
            } else {
                totalAmount += price;
            }
        }

        double discount = 0;
        if (totalAmount > 10000) {
            discount = 0.2;
        } else if (totalAmount > 1000) {
            discount = 0.1;
        }

        double finalAmount = totalAmount * (1 - discount);

        if (discount > 0) {
            System.out.println("Congratulations! You’ve saved " + (totalAmount - finalAmount) + "$");
        } else {
            System.out.println("Spend " + (1000 - totalAmount) + "$ more to get the discount. Do you want to continue?");
        }

        System.out.println("Общая сумма к оплате: " + finalAmount);
        scanner.close();
    }
}
