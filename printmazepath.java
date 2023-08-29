import java.util.*;

public class printmazepath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printmazepath(1, 1, n, m, "");

    }

    //ri - source row 
    //ci- source column
    //rf- destination row
    //cf- destination column
    public static void printmazepath(int ri,int ci,int rf,int cf, String psf){
        if(ri>rf||ci>cf){
            return;

        }
        if(ri==rf||ci==cf){
            System.out.println(psf);
            return;

        }
        printmazepath(ri, ci+1, rf, cf, psf+"h");
        printmazepath(ri+1, ci, rf, cf, psf+"v");



        
    }
}
