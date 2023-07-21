import java.util.*;

public class allindicesrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i =0 ; i< n ; i++){
            arr[i]= sc.nextInt();

        }
        int x= sc.nextInt();
        int[]iarr= allindices(arr, x, 0,0);
        if(iarr.length==0){
            System.out.println();
            return;

        }
        for(int i= 0 ; i<arr.length;i++){
            System.out.println(iarr[i]);
        }
    
        
    }
    public static int[] allindices(int arr[], int x , int idx , int fs){
 
        if(idx== arr.length){
            return new int[fs];
        }
        if(arr[idx]==x){
            int[]iarr= allindices(arr, x,idx+1, fs+1);
            iarr[fs]=idx;
            return iarr;

        }else{

        
       int[]iarr=  allindices(arr, x, idx+1, fs);
       return iarr;

        }
  
    }
}
