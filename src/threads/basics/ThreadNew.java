package threads.basics;

public class ThreadNew extends Thread{
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName() +  " world");
        }
    }
}

class ThreadNew1 implements Runnable{
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
