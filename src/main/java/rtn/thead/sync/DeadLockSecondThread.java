package rtn.thead.sync;

public class DeadLockSecondThread implements Runnable{

    final static String firstResource="FIRST_RESOURCE";
    final static String secondResource="SECOND_RESOURCE";
    @Override
    public void run() {

        synchronized (secondResource){
            System.out.println("Thread :: "+Thread.currentThread().getId()+" Locked the "+secondResource);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            synchronized (firstResource){
                System.out.println("Thread :: "+Thread.currentThread().getId()+" Locked the "+firstResource);
            }

        }


    }
}
