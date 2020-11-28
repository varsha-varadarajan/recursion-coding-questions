import java.util.ArrayList;
import java.util.List;

/* Sort elements in a list using recursion
*/

public class SortList {
    public void sort(List<Integer> l) {
        if (l.size() == 1) {
            return;
        }
        // logic - remove last element, sort remaining, and insert the last into the right postion
        int last = l.get(l.size() - 1);
        l.remove(l.size() - 1);
        sort(l);
        
        // induction - this could've been done iteratively. Here I'm using recursion
        insert(l, last);       
    }
    
    public void insert(List<Integer> l, int val) {
        // base - add element directly into list if list is empty
        // or if the element is >= the last element in the list
        if (l.size() == 0 || l.get(l.size() - 1) <= val) {
            l.add(val);
            return;
        }
        // logic - remove last elemet, insert into right postion in the remaining list
        // and add back the removed element
        int last = l.get(l.size() - 1);
        l.remove(l.size() - 1);
        insert(l, val);
        // induction
        l.add(last);
    }
}

class SortListDriver {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(-7);
        list.add(5);
        list.add(2);

        SortList s = new SortList();
        s.sort(list);
        for (int i: list) {
            System.out.print(i + " ");
        }
    }
}
