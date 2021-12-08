public class countBits {
    public static void main(String[] args) {
        for (int i : countBits(6)) {
            System.out.println(i);
        }

    }

    public static int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i < bits.length; i++) {
            bits[i] = getBinaryNum(i);
        }
        return bits;
    }

//    public static int getBinaryNum(int n) {
//        char[] res = (Integer.toBinaryString(n)).toCharArray();
//        System.out.println(res);
//        int bit = 0;
//        for (char c : res) {
//            if (c == '1') bit++;
//        }
//        return bit;
//    }

    public static int getBinaryNum(int n) {
        return (Integer.toBinaryString(n)).split("1", -1).length-1;
    }
}
