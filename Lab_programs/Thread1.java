package Lab_programs;
import java.util.*;

public class Thread1 {
    public static void main(String args[]) {
        RandomThread tr = new RandomThread();
        Thread t1 = new Thread(tr);
        t1.start();
    }


    public static class Square implements Runnable {
        public int x;

       public  Square(int x) {
            this.x = x;
        }

        public void run() {
            System.out.println("Thread 2 has started of" + x + "is" + (x * x));
        }
    }

    public static class Cube implements Runnable {
        public int x;

        public Cube(int x) {
            this.x = x;
        }

      public   void run() {
            System.out.println("Thread 3 started of" + x + "is " + (x * x * x));
        }
    }

    public static class RandomThread extends Thread {
       public  void run() {
            int n = 0;
            Random r = new Random();
            try {
                for (int i = 0; i < 2; i++) {
                    n = r.nextInt(100);
                    System.out.println("Main thread started and generated "+n);
                    Thread t2 = new Thread(new Square(n));
                    t2.start();
                    Thread t3 = new Thread(new Cube(n));
                    t3.start();
                    Thread.sleep(1000);
                    System.out.println("***********************");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}