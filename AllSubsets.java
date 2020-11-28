import java.util.ArrayList;
import java.util.List;

/* All subsets/powerset/subsequence
subset is actually all permutations
*/
public class AllSubsets {
    public List<String> substring(String s) {
        List<String> res = new ArrayList<>();
        if (s == null) {
            return res;
        }
        
        // helper(s, 0, res, "");
        helper1(s, "", res);
        return res;        
    }

    // creates new strings - direct reflection of recursion tree
    private void helper1(String input, String output, List<String> res) {
        if (input.length() == 0) {
            res.add(output);
            return;
        }

        String op1 = new String(output);
        String op2 = new String(output + input.charAt(0));
        String newInput = input.substring(1, input.length());
        helper1(newInput, op1, res);
        helper1(newInput, op2, res);
    }
    
    // avoids creating new strings
    private void helper(String s, int index, List<String> res, String output) {
        // base case - input is smallest - ""
        if (index == s.length()) {
            res.add(output);
            return;
        }
        
        // logic - choice
        char c = s.charAt(index);
        // dont choose
        helper(s, index+1, res, output);
        // choose
        helper(s, index+1, res, output + c);
    }
}

class AllSubstringDriver {
    public static void main(String[] args) {
        AllSubsets sb = new AllSubsets();
        List<String> ans = sb.substring("abcd");
        System.out.println(ans);
    }
}
