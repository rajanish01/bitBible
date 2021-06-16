package main.threading;

public class BasicThreadDemoSynchronized extends Thread {

    public synchronized static void executeSomeTask() {
            for (var i = 1; i != 5; i++)
                System.out.println("Current Index From Thread -> " + Thread.currentThread().getId() + " : " + i);
    }

    @Override
    public void run() {
        executeSomeTask();
    }

    public static void main(String[] args) {
        var t1 = new BasicThreadDemoSynchronized();
        var t2 = new BasicThreadDemoSynchronized();
        t1.start();
        t2.start();
    }

}
