import java.util.*;
public class stringsintroduction{
   
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in) ;  // taking string = "abcd"
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(s1);
        System.out.println(s1.length());
        for(int i = 0  ; i<s1.length(); i++){
            char ch  = s1.charAt(i);
        System.out.println(ch);

        //s.charAt(0) = 'x'; //wont work , you cant change the character of the string like this 


        //substring 
        //  s="abcd";

        // (0,1) -a- //we got a , (0,2)- ab ; 


        System.out.println(s1.substring(1,3)); //output = bc
System.out.println(s1.substring(1)); //output=bcd
for(int n = 0 ; n<s1.length(); n++){
    for(int j =n+1 ; j<=s1.length(); j++){
        System.out.println(s1.substring(n,j)); // it will print all the substring of abcd
    }
}

   
    String s3 = s1 + " " + s2;
    System.out.println(s3);

String s = "abc def ghi";
String[] parts = s.split(" "); //parts is a kind of arrays 
for(int z = 0 ;z<parts.length;z++ ){
    System.out.println(parts[z]);
}

        }
    }

}

