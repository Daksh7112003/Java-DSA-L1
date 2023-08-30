import java.util.*;

public class S3Balancedbrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                boolean val = handleclosing(st, ch); // Pass the correct closing character
                if (!val) {
                    System.out.println(val);
                    return;
                }
            }
        }
        
        if (st.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean handleclosing(Stack<Character> st, char corresoch) {
        if (st.isEmpty()) {
            return false;
        } else {
            char openBracket = getCorrespondingOpening(corresoch);
            if (st.peek() != openBracket) {
                return false;
            }
            st.pop();
            return true;
        }
    }

    public static char getCorrespondingOpening(char closing) {
        if (closing == ')') return '(';
        if (closing == '}') return '{';
        if (closing == ']') return '[';
        return '\0'; // Return a default value or handle error
    }
}
