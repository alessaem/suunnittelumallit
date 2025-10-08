import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibSeq = new FibonacciSequence();
        fibSeq.setMaxCount(10); // if you don't set this the max is MAX_VALUE
        Iterator<Integer> iterator = fibSeq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
