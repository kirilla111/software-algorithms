import java.util.ArrayList;
import java.util.List;

public class binary_watch {
    /*
    A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.

    For example, the below binary watch reads "4:51".


    Given an integer turnedOn which represents the number of LEDs that are currently on, return all possible times the watch could represent. You may return the answer in any order.

    The hour must not contain a leading zero.

    For example, "01:00" is not valid. It should be "1:00".
    The minute must be consist of two digits and may contain a leading zero.

    For example, "10:2" is not valid. It should be "10:02".
    * */

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(6));
    }
    // Integer.bitCount(n) return number of bits in number
    public static List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> ans = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {
            for (int min = 0; min < 60; min++) {
                if (Integer.bitCount(hour) + Integer.bitCount(min) == turnedOn)
                    if (min < 10)
                        ans.add(String.format("%d:0%d", hour, min));
                    else
                        ans.add(String.format("%d:%d", hour, min));
            }
        }
        return ans;
    }

}
