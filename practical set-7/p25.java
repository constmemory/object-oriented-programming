/*
Write a Java program where two threads print multiplication tables (e.g., Table of 5 and Table of 7). 
Use a synchronized method so that table outputs do not mix and remain consistent.
*/

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class Thread1 extends Thread {
    Table t;

    Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    Table t;

    Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}

public class p25 {
    public static void main(String[] args) {
        Table t = new Table();

        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);

        t1.start();
        t2.start();
    }
}
