
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class S7Slidingwindowmax {
  
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
 
    Stack<Integer> st= new Stack<>();
    int[]nge= new int[arr.length];
    st.push(arr.length-1);
    nge[arr.length-1]=arr.length;
     for(int i=arr.length-2;i>=0;i--){
        while(st.size()>0&&arr[i]<arr[st.peek()]){
            st.pop();

        }
        if(st.size()==0){
            nge[i]=arr.length;

        }
        else{
nge[i]=st.peek();

        }
        st.push(i);

     }
     for(int i=0;i<=arr.length;i++){
       int j=i;
       while(nge[j]<i+k){
        j=nge[j];

       }
       System.out.println(arr[j]);
     }

     

   }  

}
