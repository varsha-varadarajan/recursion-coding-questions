import java.util.ArrayList;
import java.util.List;

public class Binary {
    List<String> prefix(int n) {
        List<String> res = new ArrayList<>();
        helper("", 0, 0, n, res);
        return res;
    }

    private void helper(String output, int ones, int zeroes, int n, List<String> res) {
        if (n == 0) {
            res.add(output);
            return;
        }

        helper(output + "1", ones+1, zeroes, n-1, res);
        if (ones > zeroes) {
            helper(output + "0", ones, zeroes+1, n-1, res);
        }
    }
}

class BinaryDriver {
    public static void main(String args[]) {
        Binary b = new Binary();
        List<String> res = b.prefix(4);
        System.out.println(res);
    }
}
