import java.util.*;
public class DP1intro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibon = fiboMEMOIZED(n , new int[n+1]);
        System.out.println(fibon);

        
    }
    public static int fiboMEMOIZED(int n , int[]qb){

        if(n==0 || n==1){
            return n ;

        }
        if(qb[n]!=0){
            return qb[n];

        }
        int fibnm1 =fiboMEMOIZED(n-1,qb);
        int  fibm2 =fiboMEMOIZED(n-2, qb);
        int fibn = fibnm1+fibm2;
    qb[n]= fibn;
    return fibn;

    }
}