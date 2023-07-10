import java.util.*;



public class zigzagrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        pzz(n);

    }

    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
    }
}
