import java.util.Random;

public class ArrayGenerator {
    private static Random random = new Random();
    private static final int MAX_ARRAY_NUM = 100;

    public int[] generateArray(int len){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(MAX_ARRAY_NUM);
        }
        return array;
    }
}
