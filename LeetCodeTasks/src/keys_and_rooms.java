import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class keys_and_rooms {
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<Integer>(Arrays.asList(1)));
        l.add(new ArrayList<Integer>(Arrays.asList(2)));
        l.add(new ArrayList<Integer>(Arrays.asList(3)));
        l.add(new ArrayList<Integer>(Arrays.asList()));
        System.out.println(canVisitAllRooms(l));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] canVisit = new boolean[rooms.size()];

        LinkedList<Integer> toCheck = new LinkedList<>();
        toCheck.add(0);
        int i = 0;
        while (!toCheck.isEmpty()) {
            LinkedList<Integer> toCheck_copy = new LinkedList<>(toCheck);
            for (Integer key : toCheck_copy) {
                for (Integer k : rooms.get(key)) {
                    if (!canVisit[k]) {
                        i++;
                        canVisit[k] = true;
                        toCheck.add(k);
                    }
                }
                toCheck.remove(key);
            }

        }
        return  (i == canVisit.length || (!canVisit[0] && i == canVisit.length - 1));

        // Или
//        for (int j = 1; j < canVisit.length; j++) {
//            if (!canVisit[j]) return false;
//        }
//        return true;
    }
}
