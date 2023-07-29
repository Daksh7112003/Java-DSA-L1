import java.util.*;

public class displayreversearrayrecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] =  new int[n];
        for(int i =0 ; i<n ;i++){
            arr[i]= sc.nextInt();
        }
        dar(arr,0);
    }

    public static void dar(int arr[], int idx){
        if(idx==arr.length){
            return;

        }
        dar(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
