package Threading;

public class MultiThreads extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            //System.out.println("Run method");
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args){// main thread priority is 5
        MultiThreads thread1=new MultiThreads();
        MultiThreads2 t2=new MultiThreads2();
        thread1.setPriority(10);
        System.out.println(t2.getPriority());
        t2.setName("Thread Two");
        t2.start();
        thread1.start();
        System.out.println(Thread.activeCount());
        System.out.println("Main Thread ");
        thread1.setName("My Thread!!!");
        System.out.println(thread1.getName());
        Thread.currentThread().setName("MAIN Thread");
        System.out.println(Thread.currentThread().getName());
        //int a=10/0;
    }
}

class MultiThreads2 extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            //System.out.println("Run two method");
            System.out.println(Thread.currentThread().getName());
        }}
}
