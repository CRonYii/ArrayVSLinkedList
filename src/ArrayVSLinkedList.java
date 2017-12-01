import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * ArrayVSLinkedList
 *
 * @author Rongyi Chen
 * @version 2017
 */
public class ArrayVSLinkedList {
    
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static LinkedList<Integer> linkedList = new LinkedList<>();
    
    public static Random rnd;
    public static int seed = 1;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        final int length = 100000;
        long startTime;
        double timeTaken;
        
        startTime = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            arrayList.add(0, i);
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(timeTaken);
        
        startTime = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            linkedList.add(0, i);
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(timeTaken);
        
        System.out.println();
        
        rnd = new Random(seed);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            int index = rnd.nextInt(length);
            arrayList.get(index);
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(timeTaken);
        
        rnd = new Random(seed);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            int index = rnd.nextInt(length);
            linkedList.get(index);
        }
        timeTaken = (double) (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println(timeTaken);
    }

}
