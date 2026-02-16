package Stack;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(100);
        System.out.println(st);
        st.push(200);
        System.out.println(st);
        st.push(300);
        st.push(400);
        // st.pop(300); error
        st.pop();
        st.peek();
        System.out.println(st.peek()+","+st.size());
    }

}
