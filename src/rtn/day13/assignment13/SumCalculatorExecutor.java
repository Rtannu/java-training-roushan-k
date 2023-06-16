package rtn.day13.assignment13;

class SumCalculatorExecutor implements Runnable {
    private  int[] inputArray;
    private  int start;
    private  int end;
    private int partialSum;

    public SumCalculatorExecutor(int startIndex, int endIndex,int[] array) {
        this.inputArray = array;
        this.start = startIndex;
        this.end = endIndex;
        this.partialSum = 0;
    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += inputArray[i];
        }
    }
}
