import java.awt.*;
import java.util.Random;

public class Algorythms {
    public static Random rnd = new Random();

    public static void qSort(int[] array, int l, int r) {
        if (l >= r) return;

        int x = array[rnd.nextInt(r - l) + l];

        int i = l;
        int j = r;

        do {
            while (array[i] < x) i++;
            while (array[j] > x) j--;

            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;

                i++;
                j--;
            }
        } while (i < j);


        if (l < j) qSort(array, l, j);
        if (i < r) qSort(array, i, r);

    }

    public static int getInversionNum(int[] array) {
        int inv_count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    System.out.println("Ai: " + array[i] + ", Aj:" + array[j]);
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    public static void logArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {

        final int len = 5;

        int[] a = ArrayGenerator.generateArray(len);
        logArray(a);
        System.out.println(getInversionNum(a));

        long time = System.currentTimeMillis();

        System.out.println("qSort started..");
        qSort(a, 0, a.length - 1);
        System.out.println("qSort ended..");
        logArray(a);
        System.out.println("Time spent -> " + (System.currentTimeMillis() - time) + " mills");

    }
}
