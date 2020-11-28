import java.util.ArrayList;
import java.util.List;

/* Input: "abc"
   Output: "a b c", "a bc", "ab c", "abc"
*/
public class PermutationWithSpaces {
    void permutationWithSpaces(String s, String output, int index, List<String> res) {
        if (index == s.length()) {
            res.add(output);
            return;
        }

        char c = s.charAt(index);
        // with space
        permutationWithSpaces(s, output + " " + c, index + 1, res);
        // without space
        permutationWithSpaces(s, output + c, index + 1, res);
    }
}

class PermutationWithSpacesDriver {
    public static void main(String[] args) {
        String s = "abc";
        PermutationWithSpaces p = new PermutationWithSpaces();
        List<String> res = new ArrayList<>();

        // since we do not want to have space before start of string, initialize output with first char
        String input = s.substring(1, s.length());
        String output = new String(new char[] {s.charAt(0)});

        p.permutationWithSpaces(input, output, 0, res);
        System.out.println(res);
    }
}
