package rtn.day12.assignment12;

public class ExtendingThread extends Thread{

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("Extending Thread Number :: "+i);
        }
    }
}
