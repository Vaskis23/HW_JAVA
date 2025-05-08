package HW_2;
import java.util.Scanner;
//программа, которая получает символы, введенные с клавиатуры, до тех пор, пока не встретится точка.
public class CharCounter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int spaceCount = 0;
        char ch;

        System.out.println("Введите символы (завершение - точка):");

        do {
            ch = scanner.next().charAt(0);
            if (ch == ' ') spaceCount++;
        } while (ch != '.');

        System.out.println("Количество пробелов: " + spaceCount);
    }
}