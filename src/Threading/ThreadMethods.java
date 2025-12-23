package Threading;

public class ThreadMethods extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            //System.out.println(i+Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
        }
    }

    public static void main(String[] args)throws InterruptedException{
        ThreadMethods t1=new ThreadMethods();
        ThreadMethods t3=new ThreadMethods();
        ThreadMethods t2=new ThreadMethods();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        t1.start();
        System.out.println(t1.getState());
        t2.start();
        t3.start();
        //t1.start();//IllegalThreadStateException
        System.out.println(t1.getState());
        //t1.join();
        System.out.println(t1.getState());
        //t2.join();
        Thread.yield();//give chance to other threads

        System.out.println(t1.getState());
    }
}
