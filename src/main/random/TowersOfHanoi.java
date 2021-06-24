package main.random;

/**
 * Towers Of Hanoi
 */
public class TowersOfHanoi {

    private static void solve(int n, char source, char dest, char aux) {
        if (n == 1) {
            System.out.println("Moving Disk From Rod " + source + " To Rod " + dest);
            return;
        }

        //Moving n-1 disks from source to auxiliary rod
        solve(n - 1, source, aux, dest);

        //Move n disk to destination rod
        System.out.println("Moving Disk From Rod " + source + " To Rod " + dest);

        //Moving n-1 disks to destination rod
        solve(n - 1, aux, dest, source);
    }

    public static void main(String[] args) {

        int n = 4;

        solve(n, 'A', 'C', 'B');

    }

}
