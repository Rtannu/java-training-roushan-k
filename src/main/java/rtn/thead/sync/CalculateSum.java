package rtn.thead.sync;

public class CalculateSum {

    private int start;
    private int end;
    private int[] arrayInput;
    private int partialSum;

    public CalculateSum(int start, int end, int[] arrayInput) {
        this.start = start;
        this.end = end;
        this.arrayInput = arrayInput;
        this.partialSum = 0;
    }

     void sum() {
        for (int i = start; i <= end; i++) {
            partialSum += arrayInput[i];
        }
    }

    public int getPartialSum(){
        return this.partialSum;
    }
}
