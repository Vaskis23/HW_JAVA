//package HW_5;
//
//import java.util.Queue;
//class Queue {
//    char q[];
//    int putloc, getloc;
//
//    Queue(int size) {
//        q = new char[size + 1];
//        putloc = getloc = 0;
//    }
// void put(char ch) {
//        if (putloc == q.length - 1){
//            System.out.println(" - Очередь заполнена");
//        return;
//    }
//
//        putloc++;
//        q[putloc] ch;
//    }
//        char get() {
//        if (getloc == putloc) {
//            System.out.println(" - Очередь пуста");
//            return (char) 0;
//        }
//            getloc++;
//            return q[getloc];
//        }
//    }
//
//class QDemo {
//    public static void main(String args[]) {
//        Queue bigQ = new Queue(100);
//        Queue smallQ = new Queue(4);
//        char ch;
//        int i;
//
//        System.out.println("Иcпoльзoвaниe очереди ЬigQ для сохранения алфавита");
//
//        for (i = 0; i < 26; i++)
//            bigQ.put((char) ('А' + i));
//
//        System.out.print("Coдepжимoe очереди ЬigQ: ");
//        for (i = 0; i < 26; i++) {
//            ch = bigQ.get();
//            if (ch != (char) 0) System.out.print(ch);
//        }
//        System.out.println("\n");
//
//        System.out.println("Иcпoльзoвaниe очереди srnallQ для генерации ошибок");
//        for (i = 0; i < 5; i++) {
//            System.out.print("Пoпыткa сохранения " + (char) ('z' - i));
//            smallQ.put((char) ('Z' - i));
//            System.out.println();
//        }
//        System.out.println();
//        System.out.print("Coдepжимoe smallQ: ");
//        for (i = 0; i < 5; i++) {
//            ch = smallQ.get();
//            if (ch != (char) 0) System.out.print(ch);
//        }
//    }
//}
