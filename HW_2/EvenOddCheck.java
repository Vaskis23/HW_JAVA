package HW_2;

 import java.util.Scanner;
// Упражнение 3.1 (стр. 99) – Проверка числа на четность
public class EvenOddCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " - четное число.");
        else
            System.out.println(num + " - нечетное число.");
    }
}