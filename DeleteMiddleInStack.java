import java.util.Stack;

/* Delete middle element in a stack
*/

public class DeleteMiddleInStack {
    void deleteMiddleElement(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        
        // middle element - size/2 + 1
        int k = st.size()/2 + 1;
        solve(st, k);
    }
    
    void solve(Stack<Integer> st, int k) {
        if (k == 1) {
            st.pop();
            return;
        }
        
        int top = st.pop();
        solve(st, k-1);
        st.push(top);
    }
}

class DeleteDriver {
    public static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        DeleteMiddleInStack d = new DeleteMiddleInStack();
        d.deleteMiddleElement(st);
        System.out.println(st);
    }
}
