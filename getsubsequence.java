import java.util.*;

public class getsubsequence {
public static void main(String[] args) {


    //strings basics....
    
    
//     Scanner sc = new Scanner(System.in);
//     String str = "hello";
//     System.out.println(str);
//     for(int i =0 ; i<str.length(); i++){
//         char ch= str.charAt(i);    //character of the string...
//         System.out.println(ch);

//     }
//     String ss= str.substring(1,3); //substring .......
//     System.out.println(ss);
    
//  //arraylist basics 

//     ArrayList<Integer> list= new ArrayList<>();
//     list.add(10);
//     list.add(20);
//     list.add(30);
//     list.add(40);
//     System.out.println(list+"->"+list.size());
//     for(int val:list){                  //the way of printing arraylist by using the new type of loop ........
//         System.out.println(val);
//     }

//     for(int i= 0; i<list.size();i++){
//         int val=list.get(i);               //other way of printng the arraylist......
//         System.out.println(val);

//     }

//     list.set(2,300); // replacing the element of the arraylist/.......
//     System.out.println(list+"->"+list.size());
//     list.add(3,300000);
//     System.out.println(list+"->"+list.size());



    
//getsubsequence question


Scanner sc = new Scanner(System.in);
String str = sc.next();
ArrayList<String> res = gss(str);
System.out.println(res);
}

public static ArrayList<String> gss(String str) {
if (str.length() == 0) {
    ArrayList<String> bres = new ArrayList<>();
    bres.add("");
    return bres;
}

char ch = str.charAt(0);
String ros = str.substring(1);
ArrayList<String> rres = gss(ros);
ArrayList<String> mres = new ArrayList<>();

for (String rstr : rres) {
    mres.add("" + rstr);
    mres.add(ch + rstr);
}
return mres;
}
}
 
