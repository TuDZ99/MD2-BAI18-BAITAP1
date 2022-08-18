public class Main {
    public static void main(String[] args) {
        Runnable runnable1 = new NumberGenerator();
        Runnable runnable2 = new NumberGenerator();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

    }
}
