public class Terms {
    public static void main(String[] args) {
        terms(10);
    }

    /* Разложение числа на слагаемые*/

    public static void terms(int x) {
        terms(x, x, "");
    }

    public static void terms(int x, int prev, String res) {

        if (x == 0) {
            System.out.println(res.substring(3));
            return;
        }

        for (int i = prev; i >= 1; i--) {

            // Отсутсвие условие влечет StackOverFlow // 3  2+1 1+2
            if (x - i >= 0) {
                terms(x - i, i, res + " + " + i);
            }

        }

    }
}
