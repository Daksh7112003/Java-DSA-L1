 import java.util.*;

 
 
 public class displayarrayrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i = 0 ;  i<n ;i++){
            arr[i] = sc.nextInt();
        }

        da(arr,0);


         

    }
// we have expectation that it will print from idx to end..
// faith = it will print "idx + 1"  to end 

    public static void da(int[]arr, int idx){
        if(idx==arr.length){
            return;
            
        }

        System.out.println(arr[idx]);
        da(arr, idx+1);


    }
}
