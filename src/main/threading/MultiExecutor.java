package main.threading;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {

    // Add any necessary member variables here
    private List<Runnable> tasks;

    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here
        this.tasks = tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        // complete your code here
        for(Runnable task : tasks){
            Thread t = new Thread(task);
            t.start();
        }
    }

    public static void main(String[] args){
        Runnable thread1 = () -> System.out.println("Executing Task From Thread 1");
        Runnable thread2 = () -> System.out.println("Executing Task From Thread 2");
        Runnable thread3 = () -> System.out.println("Executing Task From Thread 3");
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(thread1);
        tasks.add(thread2);
        tasks.add(thread3);
        MultiExecutor executor = new MultiExecutor(tasks);
        executor.executeAll();
    }

}
