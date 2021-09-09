public class Algorythms {
    public int[] BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            /* Get % */
            System.out.println(((double) i / array.length) * 100);

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public int[] SelectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {

            /* Get % */
            System.out.println(((double) i / array.length) * 100);

            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min]) min = j;

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }

        return array;
    }

    public int[] InsertionSort(int[] array) {
        int i, key;
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;

            /* Get % */
            //System.out.println( ((double) j/array.length)*100);

            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }

        return array;
    }

    void MergeSort(int arr[], int l, int r) {
        if (l < r) {

            int m = (l + r) / 2;

            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);

            Merge(arr, l, m, r);
        }
    }

    void Merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[m + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }


    public void logArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.print("]");
        System.out.println();
    }
}
