import java.util.Random;

public class MethodStatisticsTest {

    private static Random random = new Random(0);

    public static void main(String[] args) {
        while (true) {
            doCriticalTask();
        }
    }

    private static void doCriticalTask() {
        if (random.nextInt(1000) % 999 == 0) {
            implOne();
        } else {
            implTwo();
        }
    	/*implOne();
    	implTwo();
    	implThree();*/
    	
    }

    private static void implOne() {
    	long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Math.sqrt(i);
        }
        System.out.println("Time taken by one:" + (System.nanoTime() - start));
    }

    private static void implTwo() {
    	long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            Math.sqrt(i);
        }
        System.out.println("Time taken by two:" + (System.nanoTime() - start));
    }
    
    private static void implThree() {
    	long start = System.nanoTime();
        for (int i = 0; i < 120; i++) {
            Math.sqrt(i);
        }
        System.out.println("Time taken by three:" + (System.nanoTime() - start));
    }
}
