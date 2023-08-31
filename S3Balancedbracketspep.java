import java.util.*;
public class S3Balancedbracketspep{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str= sc.next();
    Stack<Character> st= new Stack<>();

    for(int i=0; i<str.length();i++){
        char ch= str.charAt(i);
        if(ch=='{'||ch=='['||ch=='('){
          st.push(ch);

        }
        else if(ch=='}'){
            boolean val= handleclosing(st,'{');
            if(val==false){
                System.out.println(val);
                return ;
            }

           }
        else if(ch==')'){
             boolean val= handleclosing(st,')');
             if(val==false){
                System.out.println(val);
                return ;

             }

        }
        else if(ch==']'){
             boolean val= handleclosing(st,'[');
 if(val==false){
                System.out.println(val);
                return ;
 }
 else{

}
        }
        if(st.size()==0){
            System.out.println(true);
            return;


        }
        else{
            System.out.println(false);
            return;
            
        }
    }
}
public static boolean handleclosing(Stack<Character> st, char corresoch ){
    if(st.size()==0){
               
                return false;
            } else if(st.peek()!='{'){
               return false;



            }
            else{
                st.pop();
return true;

            }
}

}





