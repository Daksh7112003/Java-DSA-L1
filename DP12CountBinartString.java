import java.util.*;

public class DP12CountBinartString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

//another method .............

        // int[]dp0 = new int[n+1];
        // int[]dp1= new int[n+1];
        // dp0[1]=1;
        // dp1[1]=1;

        // for(int  i= 2 ; i<=n ; i++){
        //     dp1[i]= dp0[i-1]+dp1[i-1];
        //     dp0[i]=dp1[i-1];

        // }
        // System.out.println(dp1[n]+dp0[n]);


        // By this method 


     int oldcountzeros=1;
     int oldcountones=1;
     for(int i = 2 ; i<=n ; i++){
        int newcountzeros= oldcountones;
        int newcountones= oldcountzeros+oldcountones;
        oldcountzeros= newcountzeros;
        oldcountones=newcountones;


     }


System.out.println(oldcountones+oldcountzeros);

        }
    
}
