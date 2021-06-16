package main.threading;

//Since JAVA does not support multiple inheritance, hence we can use runnable interface
public class BasicRunnableDemo implements Runnable{

    public void executeSomeTask() {
        for (var i = 1; i != 5; i++)
            System.out.println("Current Index : " + i);
    }

    public void run(){
        executeSomeTask();
    }

    public static void main(String[] args) {
        var t1 = new Thread(new BasicRunnableDemo());
        var t2 = new Thread(new BasicRunnableDemo());
        t1.start();
        t2.start();
    }

}
