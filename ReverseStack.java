import java.util.Stack;

public class ReverseStack {
    void reverse(Stack<Integer> st) {
        if (st.isEmpty() || st.size() == 1) {
            return;
        }
        
        int top = st.pop();
        reverse(st);
        insert(st, top);
    }
    
    void insert(Stack<Integer> st, int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        
        int top = st.pop();
        insert(st, val);
        st.push(top);
    }
}

class ReverseStackDriver {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        
        System.out.println(st);
        
        ReverseStack r = new ReverseStack();
        r.reverse(st);        
        System.out.println(st);
    }
}