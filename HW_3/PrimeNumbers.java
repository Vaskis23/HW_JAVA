package HW_3;
// Упражнение 3.2 (стр. 111) – Поиск простых чисел
class PrimeNumbers {
    public static void main(String args[]) {
        int num;
        boolean isPrime;

        for (num = 2; num <= 100; num++) {
            isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.printf("%d ", num);
            }
        }
    }
}