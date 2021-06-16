package main.threading;

import java.util.Random;

public class HackScenario {

    private static final int MAX_PASSWORD = 9999;

    private static class Vault {
        private int password;

        public Vault() {
            Random random = new Random();
            this.password = random.nextInt(MAX_PASSWORD);
            System.out.println("Vault Created With Password : \n" + this.password);
        }

        public boolean isVaultHacked(int guessedPassword) {
            return this.password == guessedPassword;
        }
    }

    private static abstract class HackerAlgorithm {
        public abstract void hack();
    }

    private static class AscendingHacker extends HackerAlgorithm {

        private final Vault vault;

        public AscendingHacker(Vault vault) {
            this.vault = vault;
        }

        @Override
        public void hack(){
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < MAX_PASSWORD; i++) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (vault.isVaultHacked(i)) {
                        System.out.println("Ascending Hacker Hacked System With Password : " + i);
                        System.exit(0);
                    }
                }
            });
            t1.start();
        }
    }

    private static class DescendingHacker extends HackerAlgorithm {

        private final Vault vault;

        public DescendingHacker(Vault vault) {
            this.vault = vault;
        }

        @Override
        public void hack() {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < MAX_PASSWORD; i++) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (vault.isVaultHacked(i)) {
                        System.out.println("Descending Hacker Hacked System With Password : " + i);
                        System.exit(0);
                    }
                }
            });
            t1.start();
        }
    }

    private static class Police extends Thread {

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Police Waiting : " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Shame on you hackers ! Gotcha !");
            System.exit(0);
        }

    }

    public static void main(String[] args) {

        Vault v = new Vault();
        AscendingHacker hacker1 = new AscendingHacker(v);
        DescendingHacker hacker2 = new DescendingHacker(v);
        Thread police = new Police();

        hacker1.hack();
        hacker2.hack();
        police.start();
    }

}
