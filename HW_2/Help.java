package HW_2;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException{
        char choice;

        System.out.println("Справка:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Выберите: ");

        choice =(char) System.in.read();

        System.out.println();

        switch(choice){
            case '1' -> {
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор");
                System.out.println("else оператор");
            }
            case '2' -> {
                System.out.println("Оператор switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа:");
                System.out.println("\tпоследовательность операторов");
                System.out.println("\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}");
            }
            default -> System.out.println("Запрос не найден.");
        }
    }
}
