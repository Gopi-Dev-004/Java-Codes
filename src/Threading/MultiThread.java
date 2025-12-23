package Threading;


class MultiThread2 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Runnable method");
        }
    }
}

public class MultiThread extends Thread{

    public void run(){//running thread
        for(int i=0;i<10;i++){
            System.out.println("Run method");
        }
    }

    public static void main(String[] thread){
        MultiThread thread1=new MultiThread();//new state of thread
        //thread.run();//don't this way
        thread1.start();//new thread created
        for(int i=0;i<10;i++){
            System.out.println("Main method");
        }
        MultiThread2 th2=new MultiThread2();
        Thread thread2=new Thread(th2);
        thread2.start();
    }
}