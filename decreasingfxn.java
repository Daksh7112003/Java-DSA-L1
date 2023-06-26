  import java.util.*;
  public class decreasingfxn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        printDecreasing(n);
    }
    public static void printDecreasing(int n ){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

  }