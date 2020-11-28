import java.util.ArrayList;
import java.util.List;

/* Input: "abc"
   Output: [abc, abC, aBc, aBC, Abc, AbC, ABc, ABC]
*/
public class PermutationWithCaseChange {
    void printResult(String s, List<String> res) {
        if (s == null) {
            return;
        }
        helper(s, "", 0, res);
    }

    void helper(String input, String output, int index, List<String> res) {
        if (index == input.length()) {
            res.add(output);
            return;
        }

        char c = input.charAt(index);
        helper(input, output + c, index+1, res);
        helper(input, output + Character.toUpperCase(c), index+1, res);
    }
}

class PermutationWithCaseChangeDriver {
    public static void main(String[] args) {
        String s = "abc";
        PermutationWithCaseChange p = new PermutationWithCaseChange();
        List<String> res = new ArrayList<>();
        p.printResult(s, res);
        System.out.println(res);
    }
}
