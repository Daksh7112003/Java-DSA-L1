import java.util.*;

public class maxofarrayrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i = 0  ; i<n ;i++){
            arr[i]=  sc.nextInt();

        }

int max = maxi(arr, 0);

System.out.println(max);

    }
    public static int maxi(int arr[], int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int x = maxi(arr, idx+1);
       if(x>arr[idx]){
           return x;

       }
    else{
        return arr[idx];

    }




    }
}
