package Yashugowa;
class MyTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class Runnableinterface {
    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t = new Thread(task);

        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}