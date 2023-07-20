import java.util.*;

// this approach will take more time.....
public class firstindxrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 int arr[] = new int[n];
 for(int i=0 ; i<n ; i++){
    arr[i] = sc.nextInt();

 }
 int d = sc.nextInt();
 int fi =firstindex(arr,0,d);
 System.out.println(fi);


    }
    public static int firstindex(int[]arr  , int idx , int x){
        if(idx==arr.length){
            return -1;
        }

        int fisa= firstindex(arr, idx +1, x);
        if(arr[idx]==x){
            return idx;

        }
        else{
            return fisa;

        }

    }
}




// this approch will take less time ...



public class firstindxrecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int arr[]= new int[n];
        for(int i  = 0  ; i< n ; i++){
            arr[i]= sc.nextInt();


        }
        int d = sc.nextInt();
        int f= firstindex(arr,0,d);
        System.out.println(f);
    }
    public static int firstindex(int arr[], int idx, int x){
        if(idx==arr.length){
            return -1;

        }
        if(arr[idx]==x){
            return idx;

        }
        else{

        
        int fisa = firstindex(arr, idx+1, x);
        return fisa;


    }
}
}