package paket1;

public class Main {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);

                }
            }
        };

        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r1, "B");

        t1.start();
        t2.start();

    }
}
