import java.util.Stack;

/* Sort elements in a stack using recursion
*/

public class SortStack {
    void sortStack(Stack<Integer> st) {
        if (st.isEmpty() || st.size() == 1) {
            return;
        }
        
        int top = st.pop();
        sortStack(st);
        insert(st, top);
    }
    
    void insert(Stack<Integer> st, int val) {
        if (st.isEmpty() || st.peek() <= val) {
            st.push(val);
            return;
        }
        
        int top = st.pop();
        insert(st, val);
        st.push(top);
    }
}

class SortStackDriver {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(1);
        st.push(7);
        st.push(3);
        st.push(-5);
        System.out.println(st);

        SortStack s = new SortStack();
        s.sortStack(st);
        System.out.println(st); 
    }
}
