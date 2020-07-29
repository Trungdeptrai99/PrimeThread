public class OptimizedPrimeFactorization implements Runnable {

    int maxValue = 1000;

    public OptimizedPrimeFactorization() {
    }

    public OptimizedPrimeFactorization(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public void run() {
        int number = 2;
        while (number < maxValue) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(number+" Đây là luồng Optimi");
            }
            number++;
        }
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
