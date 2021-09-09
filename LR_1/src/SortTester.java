import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTester {
    private Algorythms algorythms = new Algorythms();
    private ArrayGenerator arrayGenerator = new ArrayGenerator();

    private static final int LVL_1 = 10;
    private static final int LVL_2 = 10000;
    private static final int LVL_3 = 100000;
    private static final int LVL_4 = 1000000;

    /* Bubble_sort */

    @Test
    public void Bubble_sort_test_lvl_1() {
        int[] test_array = arrayGenerator.generateArray(LVL_1);
        algorythms.logArray(test_array);
        test_array = algorythms.BubbleSort(test_array);
        algorythms.logArray(test_array);
    }

    @Test
    public void Bubble_sort_test_lvl_2() {
        algorythms.BubbleSort(arrayGenerator.generateArray(LVL_2));
    }

    @Test
    public void Bubble_sort_test_lvl_3() {
        algorythms.BubbleSort(arrayGenerator.generateArray(LVL_3));
    }

    @Test
    public void Bubble_sort_test_lvl_4() {
        algorythms.BubbleSort(arrayGenerator.generateArray(LVL_4));
    }


    /* Insertion_sort */

    @Test
    public void Insertion_sort_test_lvl_1() {
        int[] test_array = arrayGenerator.generateArray(LVL_1);
        // algorythms.logArray(test_array);
        test_array = algorythms.InsertionSort(test_array);
        // algorythms.logArray(test_array);
    }

    @Test
    public void Insertion_sort_test_lvl_2() {
        algorythms.InsertionSort(arrayGenerator.generateArray(LVL_2));
    }

    @Test
    public void Insertion_sort_test_lvl_3() {
        algorythms.InsertionSort(arrayGenerator.generateArray(LVL_3));
    }

    @Test
    public void Insertion_sort_test_lvl_4() {
        algorythms.InsertionSort(arrayGenerator.generateArray(LVL_4));
    }


    /* Selection_sort */

    @Test
    public void Selection_sort_test_lvl_1() {
        int[] test_array = arrayGenerator.generateArray(LVL_1);
        // algorythms.logArray(test_array);
        test_array = algorythms.SelectionSort(test_array);
        // algorythms.logArray(test_array);

    }

    @Test
    public void Selection_sort_test_lvl_2() {
        algorythms.SelectionSort(arrayGenerator.generateArray(LVL_2));
    }

    @Test
    public void Selection_sort_test_lvl_3() {
        algorythms.SelectionSort(arrayGenerator.generateArray(LVL_3));
    }

    @Test
    public void Selection_sort_test_lvl_4() {
        algorythms.SelectionSort(arrayGenerator.generateArray(LVL_4));
    }

    /* Merge Sort */

    @Test
    public void Merge_sort_test_lvl_3() {
        int[] test_array = arrayGenerator.generateArray(LVL_3);
        algorythms.MergeSort(test_array, 0, LVL_3 - 1);
    }

    @Test
    public void Merge_sort_test_lvl_4() {
        int[] test_array = arrayGenerator.generateArray(LVL_4);
        algorythms.MergeSort(test_array, 0, LVL_4 - 1);
    }
}
