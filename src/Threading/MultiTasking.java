package Threading;

public class MultiTasking {

    /*
    MultiTasking:
    --------------
    >>> Executing multiple task simultaneously then its know as multitasking.
    eg: Multiple applications runs simultaneously ...oray neerathil neraya application run agurathu...

    1. Process Based MultiTasking
    2. Thread Based MultiTasking

      1. Process Based MultiTasking
      ----------------------------
     >>> Multiple task work simultaneously
     >>>Executing multiple task simultaneously where each task is the separate process.
     >>>Separate Memories.
     >>>Process based multitasking is also called as multi process

     2. Thread Based MultiTasking
     ---------------------------------
     >>>Executing multiple task simultaneously where each task is the separate part of the process.
     >>>shared memory.
     >>>Thread based multitasking is also called as multithreading.

     Thread
     ------
     >>>Thread is small unit of execution of the process.
    m1().....Thread1
    m2().....Thread2
    m3().....Thread3
    m4().....Thread4
    m5().....Thread5
    Each work simultaneously.


     uses:
     .....
     Gaming
     animation
     video
     cartoon

     Two way to create Thread :
     .........................
        >>>Implementing runnable interface.
        >>>Extending thread class

     interface Runnable:
     {
     void run();
     }

     class Thread implements Runnable{
     public void run(){}
     public void start()
     }
        //The start method call the  run() method
        //When start call the new thread is created and run the run() method

     Thread Lifecycle
     ----------------------
     New.........>Creating object for run method has class that time it go to new or born stage
     Runnable....>When obj.start();
     Running.....>JVM thread shedular chose the what thread is run. if thread shedular decided
     Blocked.....>may or may not work when (wait()  or sleep()) after go again runnable state and run then blocked or dead
     dead........>Complete execution then dead


      */
}
