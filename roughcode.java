import java.util.*;
import java.io.*;
public class roughcode{

    //duplicate brackets


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str= sc.next();

//         Stack<Character> st= new Stack<>();
//           for(int i=0;i<str.length();i++){
//             char ch= str.charAt(i);
//             if(ch==')'){
//                 if(st.peek()=='('){
//                     System.out.println(true);
//                     return;

//                 }
//                 else{
//                     while(st.peek()!='('){

                    
//                     st.pop();

//                 }
//                 st.pop();

               
                
//             }
//         }
//             else{
//                 st.push(ch);

//             }
 
//           }
//           System.out.println(false);

//     }

// }




                  //BALANCED BRACKETS




//                   public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     String str= sc.next();
//                     Stack<Character> st= new Stack<>();
//                    for(int i=0;i<str.length();i++){
//                       char ch= str.charAt(i);

                   

//                    if(ch=='{'||ch=='('||ch=='['){
//                     st.push(ch);


//                    }
//                    else if(ch=='}'){
// boolean val= closing(st, '{');
// if(val==false){
//     System.out.println(false);
// }
//                    }
//                    else if(ch==')'){
// boolean val= closing(st, '(');
// if(val==false){
//     System.out.println(false);
// }
//                    }
//                    else if(ch==']'){
// boolean val= closing(st, '[');
// if(val==false){
//     System.out.println(false);
// }
//                    }
                
                  

//                   }

// if(st.size()==0){
//     System.out.println(true);
// }
// else{
//     System.out.println(false);
// }

//                   }
// public static boolean closing(Stack<Character> st, char corresoch){
// if(st.size()==0){
//    return false;

// }
// else if(st.peek()!=corresoch){
//    return false;
// }
// else {
//     st.pop();
//     return true;
// }

// }

// }



//next greater element on the right ..................
 






  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
int[]nge = new int[arr.length];
Stack<Integer> st= new Stack<>();
st.push(arr[arr.length-1]);
nge[arr.length-1]=-1;
for(int i=arr.length-2;i>=0;i--){
    while(st.size()>0&& arr[i]>st.peek()){
        st.pop();

    }
    if(st.size()==0){
        nge[i]=-1;


    }
    else{
nge[i]=st.peek();


    


}
st.push(arr[i]);

} 





   return nge;

 }

}






