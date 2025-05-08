package HW_1;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double earth_mass, Pm;

        System.out.print("Enter your weight: ");
        earth_mass=scanner.nextDouble();

        Pm=earth_mass*(9.81*0.17);
        System.out.println("On the moon, your weight will be "+Pm+" H");
    }
}
