public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactorization lazyPrimeFactorization =new LazyPrimeFactorization(5);

        OptimizedPrimeFactorization optimezed = new OptimizedPrimeFactorization(5);

        Thread thread1 = new Thread(lazyPrimeFactorization);

        Thread thread2 = new Thread(optimezed);

        thread2.start();
        thread2.join();
        thread1.start();
        thread1.join();
        System.out.println("Thời gian tổng là: "+(lazyPrimeFactorization.sumTime+optimezed.sumTime));
    }
}
