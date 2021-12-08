import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class generate_parentheses {
    /*
        Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    */
    public static void main(String[] args) {
        var ans = generateParenthesis(1);
        System.out.println(ans);
        System.out.println(ans.size());


    }

    public static List<String> generateParenthesis(int n) {
        HashSet<String> ans = new HashSet<>();
        rec(n, 0, "\"", ans);
        return new ArrayList<String>(ans);
    }

    public static String d_p(int n) {
        return "(".repeat(n);
    }

    public static String d_m(int n) {
        return ")".repeat(n);
    }


    public static void rec(int toOpen, int toClose, String str, HashSet<String> ans) {
        if (toOpen <= 0) {
            ans.add(str + ")".repeat(toClose)+"\"");
            return;
        }
        for (int i = 1; i <= toOpen; i++) {
            for (int j = 1; j <= toClose + i; j++) {
                rec(toOpen - i, toClose - j + i, str + d_p(i) + d_m(j), ans);
            }

        }
    }
}
