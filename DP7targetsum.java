// import java.util.*;

// public class DP6targetsum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int tar = sc.nextInt();
//         boolean[][] dp = new boolean[n + 1][tar + 1];
//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j <= tar; j++) {
//                 if (i == 0 && j == 0) {
//                     dp[i][j] = true;
//                 } else if (i == 0) {
//                     dp[i][j] = false;
//                 } else if (j == 0) {
//                     dp[i][j] = true;
//                 } else {
//                     int val = arr[i - 1];
//                     if (j >= val) {
//                         if (dp[i - 1][j - val]) {
//                             dp[i][j] = true;
//                         }
//                     }
//                 }
//             }
//         }
//         System.out.println(dp[n][tar]);
//     }
// }




import java.util.*;

public class DP7targetsum {

    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        int tar = sc.nextInt();


        boolean[][] dp = new boolean[arr.length + 1][tar + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    
                    if(dp[i - 1][j] == true){
                        dp[i][j] = true;
                    } else {
                        int val = arr[i - 1];
                        if (j >= val && dp[i - 1][j - val] == true) {
                            dp[i][j] = true;
                        }
                    }
                }
            }
        }

        System.out.println(dp[dp.length - 1][tar]);
    }
}
