import java.util.*;

public class printsubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String str= sc.next();
        printss(str,"");



    }
    public static void printss(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;


        }
        char ch = ques.charAt(0);
        String roq= ques.substring(1);
       
        printss(roq, ans+ch);
        printss(roq, ans+"");

    }
}
