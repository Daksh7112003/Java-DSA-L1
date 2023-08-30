import java.util.*;
public class S1Stacksintro{
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>(); // the way you define stack
        st.push(10);
        st.push(20); //pushing the element into the stack

        System.out.println(st);
        st.push(45);
        System.out.println(st);
        System.out.println(st.peek()+" " +st.size());
//peek tells the top element of the stack
//size tells the size....
st.pop();
st.pop();
System.out.println(st);
    }
}