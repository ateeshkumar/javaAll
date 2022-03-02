class Mythread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Girlfriend chatting");
        }
    }
}

class Mythread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            // Thread.s

            System.out.println("cooking food");
        }
    }
}

public class thread {
    public static void main(String[] args) {
        Mythread1 c = new Mythread1();
        Mythread2 d = new Mythread2();
        c.start();
        d.start();
    }

}
