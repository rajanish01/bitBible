package main.threading;

public class Stopwatch extends Thread{

    private static boolean stop = false;

    @Override
    public void run(){
        int count = 0;
        while (!stop){

            //System.out.println(Thread.currentThread().getName() + " : " +count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(count);
        }
    }

    public static void stopTimer(){
        System.out.println(Thread.currentThread().getName() + " : Stop Called !");
        stop = true;
    }

    public static void main(String[] args){
        Thread t1 = new Stopwatch();
        t1.start();

        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stopTimer();
        }).start();
    }

}
