package main.threading;

public class ThreadJoin extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.start();
        //t1.join();    //Waits for thread to finish its task then executes other threads
        //t1.join(500);
        t2.start();
        t3.start();
        t1.join(500);

    }

}
