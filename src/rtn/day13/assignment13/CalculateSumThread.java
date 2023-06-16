package rtn.day13.assignment13;

public class CalculateSumThread implements Runnable{

    private CalculateSum calculateSum;

    public CalculateSumThread(int start, int end, int[] arrayInput){
        calculateSum=new CalculateSum(start,end,arrayInput);
    }
    @Override
    public void run() {
        calculateSum.sum();
    }

    public CalculateSum getCalculateSum() {
        return calculateSum;
    }
}
