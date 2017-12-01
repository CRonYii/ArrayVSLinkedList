import java.util.ArrayList;
import java.util.LinkedList;
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
     * @param args
     */
    public static void main(String[] args) {
        addElementsToArrayList();
        addElementsToLinkedList();
        randomAccessedToArrayList();
        randomAccessedToLinkedList();
    }
    
    /**
     * Adds 100,000 elements to the ArrayList.<br>
     * Prints out the time taken.
     */
    public static void addElementsToArrayList() {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATION; i++) {
            arrayList.add(0, i); // This is the line we care about.
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(String.format("Adding %s elements to an ArrayList took\n%s seconds", ITERATION, timeTaken));
    }
    
    /**
     * Adds 100,000 elements to the LinkedList.<br>
     * Prints out the time taken.
     */
    public static void addElementsToLinkedList() {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATION; i++) {
            linkedList.add(0, i); // This is the line we care about.
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(String.format("Adding %s elements to a LinkedList took\n%s seconds", ITERATION, timeTaken));
        
        System.out.println();
    }
    
    /**
     * Access the ArrayList at random position for 100,000 time.<br>
     * Prints out the time taken.
     */
    public static void randomAccessedToArrayList() {
        rnd = new Random(seed);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATION; i++) {
            int index = rnd.nextInt(ITERATION);
            arrayList.get(index); // This is the line we care about.
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(String.format("Random accessed to an ArrayList for %s times took\n%s seconds", ITERATION, timeTaken));
    }
    
    /**
     * Access the LinkedList at random position for 100,000 time.<br>
     * Prints out the time taken.
     */
    public static void randomAccessedToLinkedList() {
        rnd = new Random(seed);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ITERATION; i++) {
            int index = rnd.nextInt(ITERATION);
            linkedList.get(index); // This is the line we care about.
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(String.format("Random accessed to a LinkedList for %s times took\n%s seconds", ITERATION, timeTaken));
    }

}
