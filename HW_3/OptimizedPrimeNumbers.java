package HW_3;

class OptimizedPrimeNumbers {
    public static void main(String args[]) {
        int num;
        boolean isPrime;

        for (num = 2; num <= 100; num++) {
            isPrime = true;

            for (int i = 2; i * i <= num; i++) {
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

