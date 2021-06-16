package main.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread extends Thread {

    private int message;

    public WorkerThread(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.printf("%s (Start) : %d\n", Thread.currentThread().getName(), message);
        sleepThread();
        System.out.printf("%s (End)\n", Thread.currentThread().getName());
    }

    public void sleepThread() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            Thread r = new WorkerThread(i);
            executor.execute(r);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }
}
