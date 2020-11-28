import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class UniqueSubsets {
    HashSet<List<Integer>> subset(int[] a) {
        HashSet<List<Integer>> res = new HashSet<>();
        helper(a, res, new ArrayList<Integer>(), 0);
        return res;
    }

    void helper(int[] a, HashSet<List<Integer>> result, ArrayList<Integer> temp, int index) {
        if (index == a.length) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }

        ArrayList<Integer> op1 = new ArrayList<Integer>(temp);
        ArrayList<Integer> op2 = new ArrayList<Integer>(temp);
        op2.add(a[index]);

        helper(a, result, op1, index + 1);
        helper(a, result, op2, index + 1);
    }
}

class UniqueSubsetsDriver {
    public static void main(String[] args) {
        int a[] = new int[] {1,2,2};
        UniqueSubsets u = new UniqueSubsets();
        HashSet<List<Integer>> set = u.subset(a);
        System.out.println(set);
    }
}
