package HW_1;
//Упражнение 1.2 (стр. 52)
class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " галлонов соответствует " + liters + " литров.");

            counter++;
            if (counter == 10) { // После каждых 10 строк добавляем пустую строку
                System.out.println();
                counter = 0;
            }
        }
    }
}