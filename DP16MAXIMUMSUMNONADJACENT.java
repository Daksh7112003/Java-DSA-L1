import java.util.*;
public class DP16MAXIMUMSUMNONADJACENT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for(int i = 0 ; i<arr.length;i++){
            arr[i]= sc.nextInt();

        }
        int inc = arr[0];
        int exc= 0 ; 
         for(int i = 0 ;    i  <  n  ; i++){
            int newinc= exc+arr[i];
            int newexc= Math.max(inc, exc);
            inc = newinc;
            exc= newexc;


         }

         int ans= Math.max(inc,exc);
         System.out.println(ans);

 

        
    }
}