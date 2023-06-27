import java.util.*;
public class powersbylog{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x= sc.nextInt();
    int xn = power(n, x);
System.out.println(xn);
   
}
public static int power(int n , int x){
    if(n==0){
        return 1 ;

    }
    int number = power(n/2, x);
    int xn =number*number;
    if(n%2==1){
        xn=xn*x;
    }
    return xn;

}
}
