import java.util.*;

public class printmazepathjump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printmazepaths(1, 1, n, m, "");

    }
    public static void printmazepaths(int sr,int sc,int dr,int dc, String psf ){
     
        if(sr==dr&&sc==dc){
            System.out.println(psf);
            return;

        }
//move size
        for(int ms=1; ms<=dc-sc;ms++){
            printmazepaths(sr, sc+ms, dr, dc, psf+"h"+ms);
           
        }
       for(int ms=1;ms<=dr-sr;ms++){
      printmazepaths(sr+ms, sc, dr, dc, psf+"v"+ms);
         }


    }
}
