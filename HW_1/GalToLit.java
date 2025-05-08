package HW_1;
// Упражнение 1.1 (стр. 46)
import java.util.Scanner;

class GalToLit {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите объем в галлонах: ");
        double gallons = scanner.nextDouble(); // Ввод с консоли

        double liters = gallons * 3.7854; // Преобразование в литры

        System.out.println(gallons + " галлонов соответствует " + liters + " литров.");
    }
}