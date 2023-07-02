package rtn.thread;

public class Main {

    public static void main(String[] args){

        System.out.println(" ********************************************** Create a Thread by Extending Thread Class  *********************************************");
        ExtendingThread extendingThread=new ExtendingThread();
        extendingThread.start();

        System.out.println(" ********************************************** Create a Thread by Implementing Runnable Interface  *********************************************");
        ImplementingRunnableInterface implementingRunnableInterface=new ImplementingRunnableInterface();
        Thread thread=new Thread(implementingRunnableInterface);
        thread.start();

    }
}
