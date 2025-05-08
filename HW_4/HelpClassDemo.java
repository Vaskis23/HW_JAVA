package HW_4;

import java.io.IOException;

public class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        HelpDem helpobj = new HelpDem();
        char choice, ignore;

        for (;;) {
            do {
                helpobj.showmenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpobj.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            helpobj.helpon(choice);
        }
    }
}