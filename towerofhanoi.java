import java.util.*;
public class towerofhanoi{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt(); //no of disks
         int t1d =sc.nextInt();
         int t2d= sc.nextInt(); // tower name , we could also do this via strings......
         int t3d= sc.nextInt();
         toh(n,t1d,t2d,t3d);


        
    }

public static void toh(int n , int t1d , int t2d , int t3d){
    if(n==0){
        return;
    }
toh(n-1,t1d,t3d,t2d);
System.out.println(n+ "[" + t1d + " -> " + t2d + "]" );
toh(n-1,t3d, t2d,t1d);

}



}