import java.util.*;

public class DP2TABULATION {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = tabulation(n);
        System.out.println(cp);

        
    }
    public static int tabulation(int n){
        int[] dp= new int[n+1];
        dp[0]=1;



        for(int i =1 ;i<=n ; i++){
            if(i==1){
                dp[i]=dp[i-1];
                
            }
            else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];

            }
            else{
                dp[i]=dp[i-1]+ dp[i-2]+dp[i-3];

            }

     

        }
        return dp[n];
        
    }


}



















