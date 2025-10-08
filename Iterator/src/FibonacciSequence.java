import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    private int maxcount = Integer.MAX_VALUE;

    public void setMaxCount(int maxcount) {
        this.maxcount = maxcount;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(maxcount);
    }
}
