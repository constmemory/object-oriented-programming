/*
Write a Java program that creates two threads :
● First thread prints numbers from 1 to 10 at the interval of 1 second.
● Second thread prints numbers from 11 to 20 at the interval of 500 ms.
Run both threads and display the output.
*/

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 : " + i);
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Thread 2 : " + i);
            try {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class p23 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
