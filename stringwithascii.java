import java.util.*;
public class stringwithascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sr= sc.next();
        System.out.println(solution(sr));
    }

public static String solution(String sr){
    StringBuilder sb = new StringBuilder();
    sb.append(sr.charAt(0));
for(int i= 1 ;  i<sr.length(); i++){
char curr = sr.charAt(i);
char prev = sr.charAt(i-1);
int gap = curr -prev;
sb.append(gap);
sb.append(curr);


}
return sb.toString();
}
}