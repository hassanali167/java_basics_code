// MultithreadingDemo.java
// Topic: Introduction to Multithreading in Java

/*
 * Explanation:
 * This program demonstrates creating threads using the Thread class and the Runnable interface.
 */

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }
}
