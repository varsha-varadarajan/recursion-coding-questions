import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    int ans = -1;
    int josephus(int index, List<Integer> l, int dist) {
        solve(index, l, dist);
        return ans;
    }

    void solve(int index, List<Integer> l, int dist) {
        if (l.size() == 1) {
            ans = l.get(0);
            return;
        }

        int newIndex = (index + dist) % l.size();
        l.remove(newIndex);
        solve(newIndex, l, dist);
    }
}

class JosephusProblemDriver {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int n = 5;
        int k = 2;
        for (int i = 1; i <= n; i++) {
            l.add(i);
        }
        JosephusProblem j = new JosephusProblem();
        int survivor = j.josephus(0, l, k-1);
        System.out.println(survivor);
    }
}
