public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new LazyPrimeFactorization(5000));
        Thread thread2 = new Thread(new OptimizedPrimeFactorization(5000));
        double start = System.currentTimeMillis();
        thread2.start();
        thread2.join();
        thread1.start();
        thread1.join();
        double end = System.currentTimeMillis();
        System.out.println("Đây là thời gian chạy "+ (end-start)+" miliseconds");
    }
}
