package threads.threadFunctions;

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i+1 + " x 5 = " + (i+1)*5);
        }
    }
}

class MyThread2 extends Thread{

    // Providing name for the thread
    public MyThread2(String name){
        super(name);
    }

    @Override
    public void run(){
        try{
            for(int i=0; i<5; i++){
                String some = "";
                for(int j=0; j<100000; j++){
                    some += "a";
                }
                System.out.println(Thread.currentThread().getName() + " - Priority : " + Thread.currentThread().getPriority() + " - count : " + i);
                Thread.sleep(100);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadFunctions {
    public static void main(String[] args) {
        // Thread Methods
        // 1. Run
        // 2. Start
        // 3. Join
        // 4. Set Priority

        try{
            MyThread t1 = new MyThread();
            t1.start();
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello world from " + Thread.currentThread().getName() + " Thread.");

        try{
            MyThread2 th1 = new MyThread2("ibrahim");
            th1.setPriority(Thread.MAX_PRIORITY);

            MyThread2 th2 = new MyThread2("kali");
            th2.setPriority(Thread.NORM_PRIORITY);

            MyThread2 th3 = new MyThread2("max");
            th3.setPriority(Thread.MIN_PRIORITY);

            th3.start();
            th2.start();
            th1.start();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}