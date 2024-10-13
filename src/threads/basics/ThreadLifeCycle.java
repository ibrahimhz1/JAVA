package threads.basics;

public class ThreadLifeCycle extends Thread{
    // Thread States
    // 1. New
    // 2. Runnable
    // 3. Running
    // 4. Blocked / Waiting
    // 5. Terminated

    @Override
    public void run() {
        System.out.println("My thread State : RUNNING");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThreadLifeCycle tlc = new ThreadLifeCycle();                  // 'NEW' State
        System.out.println("My thread State : " + tlc.getState());    // Printing the state
        tlc.start();                                                  // 'RUNNABLE' State
        System.out.println("My thread State : " + tlc.getState());

        // Thread State is actually an Enum contains 6 Class Type values
        // 1. NEW
        // 2. RUNNABLE
        // 3. BLOCKED
        // 4. WAITING
        // 5. TIMED_WAITING
        // 6. TERMINATED

        System.out.println("Main Thread State : " + Thread.currentThread().getState());
        try {
            Thread.sleep(100);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("My Thread State : " + tlc.getState());
        try{
            tlc.join();                         // this method is called by main thread, so main method will wait until this thread 'tlc' is terminated fully.
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("My Thread State : " + tlc.getState());      // Status = 'TERMINATED'
    }
}
