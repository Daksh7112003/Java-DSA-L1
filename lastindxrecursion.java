import java.util.*;

public class lastindxrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i]= sc.nextInt();

        }
int d =sc.nextInt();
int lii= lastindex(arr, 0, d);
System.out.println(lii);
    }

public static int lastindex(int arr[] , int idx, int x ){
    if(idx==arr.length){
        return -1 ;

    }
    int lisa = lastindex(arr, idx+1, x);
    if(lisa==-1){
        if(arr[idx]==x){
            return idx;
        }
        else{
            return -1;
        }
    }
    else{
            return lisa;

        
    }
}
}

