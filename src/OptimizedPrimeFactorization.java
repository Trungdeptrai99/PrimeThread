public class OptimizedPrimeFactorization implements Runnable {

    int maxValue = 1000;

    public OptimizedPrimeFactorization() {
    }

    public OptimizedPrimeFactorization(int maxValue) {
        this.maxValue = maxValue;
    }

    public double sumTime =0;

    @Override
    public void run() {
        int number = 2;



        while (number < maxValue) {
            double start = System.currentTimeMillis();
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(number+" Đây là luồng Optimi");
                System.out.println("\n");
            }
            number++;
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double end = System.currentTimeMillis();
            sumTime += (end-start);
            if(!isPrime){
                System.out.println("Không phải số nguyên tố, thời gian tổng là: "+ sumTime+" miliseconds");
                System.out.println("\n");
            }
            System.out.println("Đây là thời gian chạy Optomized "+ sumTime+" miliseconds");
            System.out.println("\n");
        }
    }
}
