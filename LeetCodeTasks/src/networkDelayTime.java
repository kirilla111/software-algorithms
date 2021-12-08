import java.util.*;

public class networkDelayTime {
    public static void main(String[] args) {
        System.out.println(networkDelayTime(new int[][]{
                {4, 2, 76}, {1, 3, 79},
                {3, 1, 81}, {4, 3, 30},
                {2, 1, 47}, {1, 5, 61},
                {1, 4, 99}, {3, 4, 68},
                {3, 5, 46}, {4, 1, 6},
                {5, 4, 7}, {5, 3, 44},
                {4, 5, 19}, {2, 3, 13},
                {3, 2, 18}, {1, 2, 0},
                {5, 1, 25}, {2, 5, 58},
                {2, 4, 77}, {5, 2, 74}}, 5, 3));
    }

    public static int networkDelayTime(int[][] times, int n, int k) {
        if (times.length < k) return -1;

        // [1, n]
        Integer[] paths = new Integer[n + 1];


        paths[k] = 0;
        ArrayList<Integer> toCheck = new ArrayList<>();
        toCheck.add(k);

        while (!toCheck.isEmpty()) {
            ArrayList<Integer> toPush = new ArrayList<>();
            for (int[] time : times) {
                for (Integer i : toCheck) {
                    if (time[0] == i) {
                        if (paths[time[1]] != null) {
                            if (paths[time[1]] > paths[i] + time[2]) {
                                paths[time[1]] = paths[i] + time[2];
                                toPush.add(time[1]);
                            }
                        } else {
                            toPush.add(time[1]);
                            paths[time[1]] = paths[i] + time[2];
                        }

                    }
                }
            }

            toCheck.clear();
            toCheck.addAll(toPush);

        }
        int max = 0;
        for (int i = 1; i < paths.length; i++) {
            try {
                if (paths[i] > max) max = paths[i];
            } catch (Exception e) {
                return -1;
            }
        }
        return max;

    }
}
