import java.util.*;
public class DP2ClimbingStairs{


    // Vahiyaat code with recursion..........
    //Vahiyaat code resolve by dp (qb[]).......10

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countpaths(n ,new int[n+1] );
        System.out.println(cp);
    
    }
    public static int countpaths(int n , int[] qb){


        if(n==0){
            return 1 ;
            
        }


        else if (n<0){
            return 0;

        }

        if(qb[n]>0){
            return qb[n];


        }



        int nm1 = countpaths(n-1,qb);
        int nm2 = countpaths(n-2,qb);
        int nm3 = countpaths(n-3, qb );

    

        int cp = nm1 + nm2 +nm3;



        qb[n]=cp;
        return cp;


    }


    // 


}