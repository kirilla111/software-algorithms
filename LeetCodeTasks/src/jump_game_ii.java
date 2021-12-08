import java.util.Arrays;

public class jump_game_ii {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,0,8,0,3,4,7,5,6,1,0,0,5,9,7,5,3,6}));
    }

    public static int jump(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return 0;
        int jumps = 0;
        int pos = 0;

        while (pos < nums.length - 1 && pos + nums[pos] < nums.length - 1) {
            int len = nums[pos];
            if (len == 0) len = 1;
            int max = nums[pos] + nums[pos+len];
            int next_pos = pos + len;

            for (int i = 1; i < len + 1; i++) {
                if (i + nums[pos + i] > max) {
                    max = i + nums[pos + i];
                    next_pos = pos + i;
                }

            }
            pos = next_pos;
            jumps++;
        }

        if (pos < nums.length - 1) return ++jumps;

        return jumps;
    }
}
