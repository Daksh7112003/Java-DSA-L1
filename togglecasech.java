import java.util.*;
public class togglecasech {
    public static String togglecase(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i= 0 ; i<sb.length(); i++){
        char ch = sb.charAt(i);
        if(ch>='a' && ch<='z'){
            char uch = (char)('A' + ch -'a');
            sb.setCharAt(i, uch);
        }
        else if(ch>='A' && ch<='Z'){
            char lch = (char)('a'+ ch - 'A');
            sb.setCharAt(i, lch);
        }

    
            
        
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(togglecase(str));
    }
}
