import java.util.ArrayList;
import java.util.List;

/* Input: 3
   Output: ((())), (()()), (())(), ()(()), ()()()
*/
public class BalancedParantheses {
    List<String> parantheses(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0)  {
            return res;
        }
        helper(n, n, "", res);
        return res;
    }

    void helper(int open, int close, String output, List<String> res) {
        if (open == 0 && close == 0) {
            res.add(output);
            return;
        }

        // stop adding (, when you've run out of (
        if (open != 0) {
            helper(open-1, close, output + "(", res);
        }
        // add ) only when you have already added its corresponding ( before, and hence open < close
        if (close > open) {
            helper(open, close-1, output + ")", res);
        }
    }
}

class BalancedParanthesesDriver {
    public static void main(String[] args) {
        int n = 3;
        BalancedParantheses b = new BalancedParantheses();
        List<String> res = b.parantheses(n);
        System.out.println(res);
    }
}
