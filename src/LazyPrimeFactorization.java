public class LazyPrimeFactorization implements Runnable {
    int maxValue = 1000;

    public LazyPrimeFactorization(int maxValue) {
        this.maxValue = maxValue;
    }

    public LazyPrimeFactorization() {
    }

    @Override
    public void run() {
        int number = 2;
        while (number < maxValue) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(number+" Đây là luồng Lazy");
            }
            number++;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
