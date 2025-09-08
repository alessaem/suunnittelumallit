import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] smallArray = new int[30];
        int[] largeArray = new int[100000];


        for (int i = 0; i < smallArray.length; i++) {
            smallArray[i] = rand.nextInt(1000);
        }
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = rand.nextInt(10000);
        }

        SortStrategy bubble =  new BubbleSort();
        SortStrategy insertion =  new InsertionSort();
        SortStrategy quick =  new QuickSort();

        printSortTimes(smallArray, "smallArray", bubble, "BubbleSort");
        printSortTimes(smallArray, "smallArray", insertion, "InsertionSort");
        printSortTimes(smallArray, "smallArray", quick, "QuickSort");

        System.out.println();

        printSortTimes(largeArray, "largeArray", bubble, "BubbleSort");
        printSortTimes(largeArray, "largeArray", insertion, "InsertionSort");
        printSortTimes(largeArray, "largeArray", quick, "QuickSort");

    }

    private static void printSortTimes(int[] array,String arrayName, SortStrategy strategy,String name) {
        int[] copy = Arrays.copyOf(array, array.length);

        long start = System.nanoTime();
        strategy.sort(copy);
        long end = System.nanoTime();

        System.out.println(arrayName+" with "+ name+ " took: " + (end - start) + " ns");


    }
}
