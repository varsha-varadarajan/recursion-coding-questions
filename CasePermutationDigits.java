import java.util.ArrayList;
import java.util.List;

/* Input: "a1b2"
   Output: [a1b2, a1B2, A1b2, A1B2]
*/
public class CasePermutationDigits {
    void printResult(String s, List<String> res) {
        if (s == null) {
            return;
        }

        helper(s, "", 0, res);
    }

    void helper(String s, String output, int index, List<String> res) {
        if (index == s.length()) {
            res.add(output);
            return;
        }

        char c = s.charAt(index);
        if (Character.isDigit(c)) {
            helper(s, output + c, index+1, res);
        } else {
            helper(s, output + Character.toLowerCase(c), index+1, res);
            helper(s, output + Character.toUpperCase(c), index+1, res);
        }
    }
}

class CasePermutationDigitsDriver {
    public static void main(String[] args) {
        String s = "a1b2";
        CasePermutationDigits c = new CasePermutationDigits();
        List<String> res = new ArrayList<>();
        c.printResult(s, res);
        System.out.println(res);
    }
}