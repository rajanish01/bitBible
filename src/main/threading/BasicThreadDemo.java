package main.threading;

public class BasicThreadDemo extends Thread{

    public void executeSomeTask() {
        for (var i = 1; i != 5; i++)
            System.out.println("Current Index : " + i);
    }

    public void run(){
        executeSomeTask();
    }

    public static void main(String[] args) {
        var t1 = new BasicThreadDemo();
        var t2 = new BasicThreadDemo();
        t1.start();
        t2.start();
    }

}
