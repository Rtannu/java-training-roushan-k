package rtn.day13.assignment13;

public class DeadLockFirstThread implements Runnable{

    final static String firstResource="FIRST_RESOURCE";
    final static String secondResource="SECOND_RESOURCE";
    @Override
    public void run() {

        synchronized (firstResource){
            System.out.println("Thread :: "+Thread.currentThread().getId()+" Locked the "+firstResource);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            synchronized (secondResource){
                System.out.println("Thread :: "+Thread.currentThread().getId()+" Locked the "+secondResource);
            }

        }


    }
}
