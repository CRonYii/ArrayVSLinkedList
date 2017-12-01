import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * ArrayVSLinkedList.
 *
 * @author The smartest person in the room.
 * @version 2017
 */
public class ArrayVSLinkedList {
    public static final int ITERATION = 100_000;

    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static LinkedList<Integer> linkedList = new LinkedList<>();

    public static Random rnd;
    public static int seed = 1;

    public static long startTime;
    public static double timeTaken;

    /**
     * Drives the program
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        addElementsToList(arrayList); // adds 100,000 element to the arrayList
        addElementsToList(linkedList); // adds 100,000 element to the linkedList
        randomAccessedToList(arrayList); // access the arrayList at random position for 100,000 times
        randomAccessedToList(linkedList); // access the linkedList at random position for 100,000 times
    }

    /**
     * Adds 100,000 elements to the given List.<br>
     * Prints out the time taken.
     * @param list the List to be added
     */
    public static void addElementsToList(List<Integer> list) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATION; i++) {
            list.add(0, i); // This is the line we care about.
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(String.format("Inserting %s elements took\n%s seconds", ITERATION, timeTaken));
    }

    /**
     * Access the given List at random position for 100,000 time.<br>
     * Prints out the time taken.
     * @param list the List to be accessed
     */
    public static void randomAccessedToList(List<Integer> list) {
        rnd = new Random(seed);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATION; i++) {
            int index = rnd.nextInt(ITERATION); // randomly generated
            list.get(index); // This is the line we care about.
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(
                String.format("Random accessed for %s times took\n%s seconds", ITERATION, timeTaken));
    }

}
