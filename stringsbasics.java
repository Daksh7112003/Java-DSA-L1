import java.util.*;

public class getsubsequence {
public static void main(String[] args) {


    //strings basics....
    
    
    Scanner sc = new Scanner(System.in);
    String str = "hello";
    System.out.println(str);
    for(int i =0 ; i<str.length(); i++){
        char ch= str.charAt(i);    //character of the string...
        System.out.println(ch);

    }
    String ss= str.substring(1,3); //substring .......
    System.out.println(ss);
}
}
