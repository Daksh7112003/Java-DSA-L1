import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");
        System.out.println(sb);
        char ch = sb.charAt(0);
        System.out.println(ch);
        sb.setCharAt(0, 'd');
        System.out.println(sb);
        sb.insert(2,'f'); 
        System.out.println(sb);
        sb.deleteCharAt(2);
System.out.println(sb);
sb.append('f'); // to add the char at last
System.out.println(sb);
System.out.println(sb.length());

//duration of the program 

int n = 1000000;
long start = System.currentTimeMillis();
StringBuilder ab = new StringBuilder();
for(int i= 0; i<n ; i++){
    sb.append(i);


}
long end  = System.currentTimeMillis();
long duration = end-start;
System.out.println(duration);


    }
}
