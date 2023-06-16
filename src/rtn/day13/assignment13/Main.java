package rtn.day13.assignment13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /************************************** calculate the sum of elements in the array *************************************************************/
        final int THREAD_NUMBER = 5;
        int[] inputArray = new int[100];
        for (int i = 0; i < 100; i++) {
            inputArray[i] = i + 1;
        }

        int partitionSize = inputArray.length / THREAD_NUMBER;
        CalculateSumThread[] calculateSumThreadList = new CalculateSumThread[5];
        for (int i = 0; i < THREAD_NUMBER; i++) {
            int start = i * partitionSize;
            int end = start + partitionSize - 1;
            CalculateSumThread calculateSumThread = new CalculateSumThread(start, end, inputArray);
            calculateSumThreadList[i] = calculateSumThread;
            Thread thread = new Thread(calculateSumThread);
            thread.start();
        }

        Thread.sleep(1000);
        int totalSum = 0;
        for (CalculateSumThread calculateSumThread : calculateSumThreadList) {
            totalSum += calculateSumThread.getCalculateSum().getPartialSum();
        }

        System.out.println("Total Sum by Synchronized = " + totalSum);

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_NUMBER);

        SumCalculatorExecutor[] sumCalculatorExecutors = new SumCalculatorExecutor[5];
        for (int i = 0; i < THREAD_NUMBER; i++) {
            int start = i * partitionSize;
            int end = start + partitionSize - 1;
            SumCalculatorExecutor sumCalculatorExecutor = new SumCalculatorExecutor(start, end, inputArray);
            sumCalculatorExecutors[i] = sumCalculatorExecutor;
            executor.submit(sumCalculatorExecutor);

        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
         totalSum = 0;
        for (CalculateSumThread calculateSumThread : calculateSumThreadList) {
            totalSum += calculateSumThread.getCalculateSum().getPartialSum();
        }

        System.out.println("Total Sum by Executor= " + totalSum);



        /************************************** ticket booking system with multiple threads *************************************************************/
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(10);
        for (int i = 0; i < 20; i++) {
            (new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        ticketBookingSystem.book();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                }
            })).start();
        }



        /************************************** deadlocks between two threads *************************************************************/

        DeadLockFirstThread deadLockFirstThread = new DeadLockFirstThread();
        DeadLockSecondThread deadLockSecondThread = new DeadLockSecondThread();
        Thread firstDeadLockThread = new Thread(deadLockFirstThread);
        Thread secondDeadLockThread = new Thread(deadLockSecondThread);
        firstDeadLockThread.start();
        secondDeadLockThread.start();

    }

}
