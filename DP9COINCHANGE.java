import java.util.*;

public class DP9COINCHANGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int coin[]= new int[n];
        for(int i = 0 ; i<coin.length ; i++){
            coin[i] = sc.nextInt();


        }
        int tar = sc.nextInt();
        int dp[] =new int[tar+1];
        dp[0] =1;


        for(int amt= 1 ; amt<=tar ;amt++){
            for(int seeke:coin){
                if(seeke<=amt){
                    int ramt = amt -seeke ; 
                    dp[amt]+=dp[ramt];

                }


            }
        }
        System.out.println(dp[tar]);
    }
}
