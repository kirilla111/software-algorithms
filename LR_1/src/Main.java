public class Main {
    public static void main(String[] args) {
        int[] test_array = new int[]{3, 4, 1, 2, 1,123,45,8,4,12,5,7,8,9};
        //BubbleSort(test_array);
        //SelectionSort(test_array);
        InsertionSort(test_array);

        for (int i = 0; i < test_array.length; i++) {
            System.out.println(test_array[i]);
        }
    }

    public static int[] BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static int[] SelectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min]) min = j;

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }

        return array;
    }

    public static int[] InsertionSort(int[] array) {
        int i, key;
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;

            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }

        return array;
    }
}
