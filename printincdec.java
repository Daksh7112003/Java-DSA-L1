import java.util.*;
 public class printincdec {
    public static void main(String[] args) {
        
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        incdec(n);

    }
    public static void incdec(int n){

        if(n==0){
            return;
        }
        System.out.println(n);


        incdec(n-1);

System.out.println(n);
;
    }
}
