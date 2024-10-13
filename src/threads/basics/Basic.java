package threads.basics;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        ThreadNew tn = new ThreadNew();   // New State
        // tn.start();
        ThreadNew1 tn1 = new ThreadNew1(); // New State
        Thread th = new Thread(tn1);
        th.start();                        // Runnable
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
