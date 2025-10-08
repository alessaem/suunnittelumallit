import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int previous = 1;
    private int current = 1;
    private int count = 0;
    private int max;

    public FibonacciIterator(int max) {
       this.max = max;
    }


    @Override
    public boolean hasNext() {
        return count < max;
    }

    @Override
    public Integer next() {
        int result;
        if(count == 1 || count == 0){
            result = 1;
        }
        else{
            result = previous+current;
            previous = current;
            current = result;
        }
        count++;
        return result;
    }
}
